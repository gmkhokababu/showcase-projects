import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-allproperty',
  templateUrl: './allproperty.component.html',
  styleUrls: ['./allproperty.component.css']
})
export class AllpropertyComponent implements OnInit {

  allProperty:any=[];
  constructor(private myservice:LoginService, private router:Router) {
    this.myservice.showall().subscribe((x)=>{
      this.allProperty=x;
    })
   }

  ngOnInit(): void {
  }

}
