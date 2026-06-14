import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LocationService } from '../../services/location.service';

@Component({
  selector: 'app-product-home',
  imports: [CommonModule],
  templateUrl: './product-home.component.html',
  styleUrl: './product-home.component.css'
})
export class ProductHomeComponent {

  // Demo product list 
  products = [
    { id: 1, name: 'Premium Wireless Headphones', price: 299, rating: 4.8, image: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500' },
    { id: 2, name: 'Minimalist Smart Watch', price: 199, rating: 4.5, image: 'https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=500' },
    { id: 3, name: 'Mechanical Gaming Keyboard', price: 129, rating: 4.7, image: 'https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=500' },
    { id: 4, name: 'Ergonomic Wireless Mouse', price: 79, rating: 4.4, image: 'https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7?w=500' },
    { id: 5, name: '4K Ultra Slim Monitor', price: 449, rating: 4.9, image: 'https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=500' },
    { id: 6, name: 'Smart Fitness Band', price: 49, rating: 4.2, image: 'https://images.unsplash.com/photo-1575311373937-040b8e1fd5b6?w=500' }
  ];

  // Store user country info
  userCountry: string = '';

  constructor(
    private router: Router,
    private locationService: LocationService // Inject service
  ) { }

  ngOnInit(): void { 
    this.detectUserCountry();
  }

  // Fetch country using service
  detectUserCountry() {
    this.locationService.getUserLocation().subscribe({
      next: (data) => {
        this.userCountry = data.country_name;
        console.log('User Country Detected:', this.userCountry);
        console.log('Full Location Data:', data); // You can see city, region, ip etc.
      },
      error: (err) => {
        console.error('Error detecting country:', err);
      }
    });
  }

  // Redirect to product details page
  viewProductDetails(productId: number) {
  this.router.navigate(['/home/product-details'], { 
    state: { id: productId } 
  });
}

}
