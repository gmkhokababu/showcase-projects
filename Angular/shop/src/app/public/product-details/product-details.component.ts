import { CommonModule, Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  imports: [CommonModule],
  templateUrl: './product-details.component.html',
  styleUrl: './product-details.component.css'
})
export class ProductDetailsComponent implements OnInit {

  productId!: number;
  
  // ডামি প্রোডাক্ট ডাটা (পরবর্তীতে সার্ভিস থেকে আসবে)
  product: any = {
    id: 1,
    name: 'Premium Wireless Headphones',
    brand: 'Sony',
    color: 'Matte Black',
    price: 299,
    rating: 4.8,
    // মিডিয়া অ্যারে: টাইপ দিয়ে আলাদা করা হয়েছে কোনটা ইমেজ আর কোনটা ইউটিউব ভিডিও
    media: [
      { type: 'image', url: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=600' },
      { type: 'image', url: 'https://images.unsplash.com/photo-1583394838336-acd977736f90?w=600' },
      { type: 'video', url: 'https://www.youtube.com/embed/dQw4w9WgXcQ' } // নমুনা ইউটিউব এমবেড লিংক
    ],
    description: 'Experience industry-leading noise cancellation with our premium wireless headphones. Designed for ultimate comfort and high-resolution audio performance, these headphones offer up to 30 hours of battery life on a single charge.'
  };

 // বর্তমানে ক্যানভাসে কী সিলেক্টেড আছে তা ট্র্যাক করার জন্য
  selectedMedia: any = {};
  safeVideoUrl!: SafeResourceUrl;

  constructor(
    private router: Router,
    private location: Location, // আগের পেজে ব্যাক করার জন্য
    private sanitizer: DomSanitizer // স্যানিটাইজার ইনজেক্ট করুন
  ) {
    // কনস্ট্রাক্টরের ভেতর থেকে স্টেট ডাটা রিড করতে হয়
    const navigation = this.router.getCurrentNavigation();
    if (navigation?.extras.state) {
      this.productId = navigation.extras.state['id'];
    }
   }

  ngOnInit(): void {
    // URL থেকে প্রোডাক্ট আইডি নেওয়া
    // this.productId = Number(this.route.snapshot.paramMap.get('id'));
    console.log('Received Product ID via State:', this.productId);
    
    /// ডিফল্টভাবে প্রথম মিডিয়াটি দেখাবে
    this.setMedia(this.product.media[0]);
  }

  // মিডিয়া চেঞ্জ করার মেথড (থাম্বনেইল ক্লিক করলে কাজ করবে)
  setMedia(mediaItem: any) {
    this.selectedMedia = mediaItem;
    
    if (mediaItem.type === 'video') {
      // ইউটিউব ইউআরএল-কে অ্যাঙ্গুলারের জন্য নিরাপদ বা ট্রাস্টেড করা
      this.safeVideoUrl = this.sanitizer.bypassSecurityTrustResourceUrl(mediaItem.url);
    }
  }

  // ব্যাক বাটনের মেথড
  goBack() {
    this.location.back();
  }

}
