import { CommonModule, Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { ActivatedRoute, Router } from '@angular/router';
import { PublicTopNavComponent } from '../public-top-nav/public-top-nav.component';

@Component({
  selector: 'app-product-details',
  imports: [
    CommonModule,
    PublicTopNavComponent,
  ],
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
    images: [
      'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=600',
      'https://images.unsplash.com/photo-1583394838336-acd977736f90?w=600',
      'https://images.unsplash.com/photo-1484704849700-f032a568e944?w=600'
    ],
    description: 'Experience industry-leading noise cancellation with our premium wireless headphones. Designed for ultimate comfort and high-resolution audio performance, these headphones offer up to 30 hours of battery life on a single charge.'
  };

  // সিলেক্টেড ইমেজ ট্র্যাক করার জন্য
  selectedImage: string = '';

  constructor(
    private route: ActivatedRoute,
    private location: Location // আগের পেজে ব্যাক করার জন্য
  ) { }

  ngOnInit(): void {
    // URL থেকে প্রোডাক্ট আইডি নেওয়া
    this.productId = Number(this.route.snapshot.paramMap.get('id'));
    
    // ডিফল্টভাবে প্রথম ইমেজটি ক্যানভাসে দেখাবে
    this.selectedImage = this.product.images[0];
  }

  // থাম্বনেইল চেঞ্জ করার মেথড
  changeImage(imageUrl: string) {
    this.selectedImage = imageUrl;
  }

  // ব্যাক বাটনের মেথড
  goBack() {
    this.location.back();
  }

}
