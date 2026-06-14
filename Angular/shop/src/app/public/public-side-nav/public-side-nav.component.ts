import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-public-side-nav',
  imports: [],
  templateUrl: './public-side-nav.component.html',
  styleUrl: './public-side-nav.component.css'
})
export class PublicSideNavComponent implements OnInit {

  // ডাটাবেজ থেকে ডাটা আসার আগ পর্যন্ত এই ডেমো অ্যারেটি কাজ করবে
  categories = [
    { id: 1, name: 'Electronics', icon: 'bi-phone' },
    { id: 2, name: 'Fashion & Clothing', icon: 'bi-jacket' },
    { id: 3, name: 'Smart Watches', icon: 'bi-watch' },
    { id: 4, name: 'Gaming & Gadgets', icon: 'bi-controller' },
    { id: 5, name: 'Audio & Sound', icon: 'bi-headphones' },
    { id: 6, name: 'Computers & Accessories', icon: 'bi-laptop' }
  ];

  // কোন ক্যাটাগরি বর্তমানে সিলেক্টেড তা ট্র্যাক করার জন্য (ডিফল্ট ১ম টা)
  selectedCategoryId: number = 1; 

  constructor() { }

  ngOnInit(): void { }

  // ক্যাটাগরিতে ক্লিক করলে অ্যাক্টিভ স্টেট চেঞ্জ করার ফাংশন
  selectCategory(id: number) {
    this.selectedCategoryId = id;
    // ভবিষ্যতে এখানে ক্লিক করলে ডানপাশের প্রোডাক্ট ফিল্টার করার মেথড কল হবে
  }

}
