import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  constructor(private myservice:ControllerService) {
   
    this.myservice.allRole().subscribe((x)=>{
      this.role=x;
    })
    this.myservice.alldepartment().subscribe((x)=>{
      this.departments=x;
    })
   }

  ngOnInit(): void {
  }

  templete:any;
  allemployees:any=[];
  departments:any=[];
  role:any=[];

  departmentId:any;
  roleId:any;

  show(){
    this.myservice.allemployee().subscribe((x)=>{
      this.allemployees=x;
    })
  }

  changeRole(i:any){
    this.roleId=this.role[i].roleId;
  }
  changeDepartment(i:any){
    this.departmentId=this.departments[i].departmentId;
  }

}
