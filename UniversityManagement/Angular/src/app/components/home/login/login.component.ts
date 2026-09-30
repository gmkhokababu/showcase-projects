import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeDataService } from 'src/app/services/home/home-data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName:any;
  password:any;

  loginUsers:any;

  constructor(private myservice:HomeDataService, private router:Router) { }

  ngOnInit(): void {
  }

  login(){

    this.myservice.teacherLogin(this.userName,this.password).subscribe((x)=>{
      this.loginUsers=x;
      if(this.loginUsers!=null){
        this.router.navigateByUrl("/admin", { state: { response: this.loginUsers } });
        // if(this.loginUsers.role=="Teacher"){
          
        // }
      }else{
        alert("User Id and Password miss match");
      }
    })
  }

}
