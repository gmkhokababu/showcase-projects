import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../../services/users/user.service'; // ১. সার্ভিস ইম্পোর্ট করুন
import { User } from '../../models/user'; // ২. মডেল ইন্টারফেস ইম্পোর্ট করুন
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  // ফর্ম ডাটার জন্য ভ্যারিয়েবল (টাইপ নির্দিষ্ট করে দেওয়া হলো)
  username!: string;
  password!: string;

  private router = inject(Router);
  private userService = inject(UserService); // ৩. সার্ভিস ইনজেক্ট করুন

  Registration() {
    this.router.navigate(['/registration']);
  }

  login(event: Event) {
    event.preventDefault();

    // Show loading popup while checking credentials
    Swal.fire({
      title: 'Processing...',
      text: 'Please wait while we check your credentials.',
      background: '#110c22',
      color: '#ffffff',
      allowOutsideClick: false,
      didOpen: () => {
        Swal.showLoading();
      }
    });

    const credentials: User = {
      username: this.username,
      password: this.password
    };

    // Call authentication service
    this.userService.login(credentials).subscribe({
      next: (response) => {
        // Close loading popup and show success message
        Swal.fire({
          title: 'Success!',
          text: 'Login Successful!',
          icon: 'success',
          background: '#110c22',
          color: '#ffffff',
          confirmButtonColor: '#4c1d95',
          timer: 1000,
          showConfirmButton: false,
          customClass: {
            title: 'fs-5 text-white fw-semibold',
            htmlContainer: 'fs-6 text-white-50'
          }
        }).then(() => {
          // Extract roles from the backend response (assuming response.roles exists)
          const userRoles: string[] = response.roles || [];

          // Role-based routing logic
          if (userRoles.includes('SYSTEM_ADMIN')) {
            // Redirect for System Admin
            this.router.navigate(['/admin']); 
          } 
          else if (userRoles.includes('ROLE_ADMIN')) {
            // Redirect for Admin
            this.router.navigate(['/admin']); 
          } 
          else if (userRoles.includes('ROLE_CS')) {
            // Redirect for Customer Service (CS)
            // this.router.navigate(['/customer-service']); 
          } 
          else if (userRoles.includes('ROLE_CUSTOMER')) {
            // Redirect for regular Customer
            // this.router.navigate(['/home']); 
          } 
          else {
            // Default fallback directory if no matching role is found
            // this.router.navigate(['/dashboard']); 
          }
        });
      },
      error: (err) => {
        // Show error popup if authentication fails
        Swal.fire({
          title: 'Error!',
          text: err.error?.message || 'Wrong username or password!',
          icon: 'error',
          background: '#110c22',
          color: '#ffffff',
          confirmButtonColor: '#701a75'
        });
      }
    });
  }
}