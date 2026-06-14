import { Component } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-public-top-nav',
  imports: [],
  templateUrl: './public-top-nav.component.html',
  styleUrl: './public-top-nav.component.css'
})
export class PublicTopNavComponent {

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

}
