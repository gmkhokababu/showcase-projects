import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SidebarService {

  constructor() { }

   // সাইড-ন্যাভ ওপেন নাকি ক্লোজ তা ট্র্যাক করার জন্য একটি সাবজেক্ট
  private isOpenSubject = new BehaviorSubject<boolean>(false);
  isOpen$ = this.isOpenSubject.asObservable();

  // অবস্থা পরিবর্তন করার মেথড (Toggle)
  toggleSidebar() {
    this.isOpenSubject.next(!this.isOpenSubject.value);
  }
}
