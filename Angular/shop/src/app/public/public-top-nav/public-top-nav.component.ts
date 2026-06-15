import { CommonModule } from '@angular/common';
import { Component,HostListener } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-public-top-nav',
  imports: [CommonModule],
  templateUrl: './public-top-nav.component.html',
  styleUrl: './public-top-nav.component.css'
})
export class PublicTopNavComponent {

  // Boolean to track if page is scrolled
  isScrolled = false;

  constructor(private router: Router) {}

  openLoginAlert() {
    Swal.fire({
      title: 'Welcome Back!',
      text: 'Redirecting you to the secure login gateway...',
      icon: 'info',
      background: '#110c26',
      color: '#ffffff',
      confirmButtonColor: '#7c3aed',
      timer: 2000,
      showConfirmButton: false,
      timerProgressBar: true
    }).then(() => {
      // সুইটঅ্যালার্ট শেষ হলে অটোমেটিক তোমার সেই Authentication/Login পেজে নিয়ে যাবে
      this.router.navigate(['/login']); 
    });
  }

  trackOrder(){
    Swal.fire({
      title: 'Please Wait!',
      text: 'Redirecting you to the order tracking...',
      icon: 'info',
      background: '#110c26',
      color: '#ffffff',
      confirmButtonColor: '#7c3aed',
      timer: 1000,
      showConfirmButton: false,
      timerProgressBar: true
    }).then(() => {
      // সুইটঅ্যালার্ট শেষ হলে অটোমেটিক তোমার সেই Authentication/Login পেজে নিয়ে যাবে
      this.router.navigate(['/track-order']); 
    });
  }


  // Listen to window scroll event
  @HostListener('window:scroll', [])
  onWindowScroll() {
    // If scrolled more than 10px, change background
    this.isScrolled = window.scrollY > 10;
  }

  home(){
    this.router.navigate(['/home']); 
  }

  cart(){
    this.router.navigate(['/cart']);
  }



  
}
