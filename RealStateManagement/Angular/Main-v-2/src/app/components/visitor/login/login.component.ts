import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName:any;
  password:any;

  user:any;
  role:any;
  constructor(private loginservice:LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  login(){
    this.loginservice.login(this.userName,this.password).subscribe((x)=>{
      this.user=x;
      // if(this.user!=null){
        
        // this.router.navigateByUrl("/admin",{state:{responce:this.user}});
        // this.role=this.user.role;
        // if(this.role=="admin"){
        //   this.router.navigateByUrl("/admin",{state:{responce:this.user}});
        // }

        if (this.user.role=="admin"){
          this.router.navigateByUrl("/admin");
        }else  if (this.user.role=="landowner"){
          this.router.navigateByUrl("/landloard");
        }else  if (this.user.role=="system"){
          this.router.navigateByUrl("/admin");
        }
      // }
    })

  }

}
