import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userId:any;
  password:any;

  user:any;
  constructor(private myservice:ControllerService, private router:Router) {
    
   }

  ngOnInit(): void {
  }

  check(){
    this.myservice.login(this.userId,this.password).subscribe((x)=>{
      this.user=x;
    })
    if(this.user!=null){
      this.router.navigateByUrl("/admin")
    }else{
      alert("User Name and Password Missmatch")
    }
  }

}
