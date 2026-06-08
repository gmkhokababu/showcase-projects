import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2'; // SweetAlert2 ইমপোর্ট করলেন

declare var bootstrap: any;

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  u_name: any = 'admin';
  pass: any = 'admin';

  username: any;
  password: any;

  private router = inject(Router)
  Registration() {
    this.router.navigate(['/registration'])
  }
  login(event: Event) {
    // alert("login works"+"\nUsername: "+this.username+"\nPassword: "+this.password)
    if (this.u_name == this.username && this.pass == this.password) {
      // ==================Toast দেখানোর কোড===========================
      // const toastElement = document.getElementById('loginToast');
      // const toast = new bootstrap.Toast(toastElement);
      // toast.show();

      // ১.৫ সেকেন্ড পর এডমিন প্যানেলে রিডাইরেক্ট হবে যাতে টোস্টটি দেখা যায়
      // setTimeout(() => {
      //   this.router.navigate(['/admin']);
      // }, 2000);
      // ==================Toast দেখানোর কোড===========================

      // গ্লাস মরফিজম থিমের সাথে ম্যাচ করা SweetAlert2 পপআপ
      Swal.fire({
        title: 'Success!',
        text: 'Login Successful!',
        icon: 'success',
        background: '#110c22', // আপনার বডি কালার
        color: '#ffffff',      // টেক্সট কালার
        confirmButtonColor: '#4c1d95', // আপনার বাটন কালার
        timer: 1000, // ১.৫ সেকেন্ড পর নিজে নিজেই চলে যাবে
        showConfirmButton: false,
        // width: '320px', // পপআপ উইন্ডোটি ছোট করার জন্য
        customClass: {
          title: 'fs-5 text-white fw-semibold', // বুটস্ট্র্যাপ ক্লাস দিয়ে টাইটেল ছোট করা হলো
          htmlContainer: 'fs-6 text-white-50'   // বুটস্ট্র্যাপ ক্লাস দিয়ে টেক্সট ছোট করা হলো
        }
      }).then(() => {
        this.router.navigate(['/admin']);
      });
    } else {
      // alert("Wrong username or password!")
      // ভুলের জন্য লাল রঙের মডার্ন পপআপ
      Swal.fire({
        title: 'Error!',
        text: 'Wrong username or password!',
        icon: 'error',
        background: '#110c22',
        color: '#ffffff',
        confirmButtonColor: '#701a75'
      });
    }
  }

}
