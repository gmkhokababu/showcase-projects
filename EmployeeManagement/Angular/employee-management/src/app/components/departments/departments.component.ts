import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styleUrls: ['./departments.component.css']
})
export class DepartmentsComponent implements OnInit {

  templete:any;
  departmentName:any;
  alldepartments:any=[];
  constructor(private myservice:ControllerService) {
    
   }

  ngOnInit(): void {
  }

  addDepartment(){
    this.myservice.createDepartment(this.departmentName).subscribe(()=>{
      alert("Department Added");
      this.departmentName=null;
    })
    
  }

  show(){
    this.myservice.alldepartment().subscribe((x)=>{
      this.alldepartments=x;
    })
  }



}
