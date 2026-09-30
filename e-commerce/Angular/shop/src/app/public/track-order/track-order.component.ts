import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { PublicTopNavComponent } from '../public-top-nav/public-top-nav.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-track-order',
  imports: [
    CommonModule,
    PublicTopNavComponent,
    FormsModule,
  ],
  templateUrl: './track-order.component.html',
  styleUrl: './track-order.component.css'
})
export class TrackOrderComponent {
  // State variables for conditional rendering
  searchType: 'order' | 'user' = 'order';
  searchQuery: string = '';
  
  showOrderList: boolean = false;
  showOrderDetails: boolean = false;

  // Toggle search type when radio buttons change
  onSearchTypeChange(type: 'order' | 'user') {
    this.searchType = type;
    this.resetSections();
  }

  // Handle main search button click
  executeSearch() {
    if (!this.searchQuery.trim()) return;

    if (this.searchType === 'order') {
      this.showOrderList = false;     // Hide list for direct order search
      this.showOrderDetails = true;   // Directly show tracking details
    } else {
      this.showOrderList = true;      // Show multiple orders list
      this.showOrderDetails = false;  // Hide details until an order is selected
    }
  }

  // Handle "View Details" click from the order list
  viewOrderDetails(orderId: string) {
    this.showOrderDetails = true;
  }

  // Reset states on input type toggle
  private resetSections() {
    this.showOrderList = false;
    this.showOrderDetails = false;
  }

}
