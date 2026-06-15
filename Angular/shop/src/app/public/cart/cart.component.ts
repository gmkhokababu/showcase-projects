import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { PublicTopNavComponent } from '../public-top-nav/public-top-nav.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  imports: [
    CommonModule,
    PublicTopNavComponent,
  ],
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent implements OnInit{

  // Dummy cart data for visualization
  cartItems: any[] = [
    {
      id: 1,
      name: 'Premium Wireless Headphones',
      price: 299,
      quantity: 1,
      image: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=200',
      color: 'Matte Black'
    },
    {
      id: 2,
      name: 'Smart Fitness Watch Pro',
      price: 149,
      quantity: 2,
      image: 'https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=200',
      color: 'Midnight Blue'
    }
  ];

  shippingCost: number = 15;
  taxRate: number = 0.05; // 5% Tax

  constructor(private router:Router) {}

  ngOnInit(): void {}

  // Update item quantity
  updateQty(index: number, delta: number) {
    const newQty = this.cartItems[index].quantity + delta;
    if (newQty >= 1) {
      this.cartItems[index].quantity = newQty;
    }
  }

  // Remove item from cart
  removeItem(index: number) {
    this.cartItems.splice(index, 1);
  }

  // Calculation Methods
  get subtotal(): number {
    return this.cartItems.reduce((acc, item) => acc + (item.price * item.quantity), 0);
  }

  get taxAmount(): number {
    return this.subtotal * this.taxRate;
  }

  get totalAmount(): number {
    return this.cartItems.length > 0 ? (this.subtotal + this.taxAmount + this.shippingCost) : 0;
  }

  goHome(){
    this.router.navigate(['/home']);
  }

}
