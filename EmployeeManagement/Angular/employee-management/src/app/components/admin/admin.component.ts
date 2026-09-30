import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private myservice:ControllerService) {
    this.myservice.allemployee().subscribe((x)=>{
      this.allemployees=x;
    })
   }

  ngOnInit(): void {
  }

  allemployees:any=[];

}
