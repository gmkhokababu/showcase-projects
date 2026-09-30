import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Foodtransaction } from '../model/foodtransaction';

@Component({
  selector: 'app-foodorder',
  templateUrl: './foodorder.component.html',
  styleUrls: ['./foodorder.component.css']
})
export class FoodorderComponent implements OnInit {
  s_number: any;
  c_id: any;
  f_type: any;
  f_menu: any;
  amount: any;
  date: any;

  allData: any;

  constructor(private myservice: BookingService) { }

  ngOnInit(): void {
  }

  order() {
    this.allData = new Foodtransaction(this.s_number, this.c_id, this.f_type, this.f_menu, this.amount, this.date);
    this.myservice.addorder(this.allData).subscribe(() => {
      // alert("Successful");
    });

    this.add();
  }

  data: any;
  add() {
    this.myservice.addamount(this.c_id, this.amount).subscribe((x) => {
      this.data = x;
      alert("Successful");
    });
  }

}