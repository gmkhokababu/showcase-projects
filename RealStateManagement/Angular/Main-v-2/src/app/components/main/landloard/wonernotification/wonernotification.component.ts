import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-wonernotification',
  templateUrl: './wonernotification.component.html',
  styleUrls: ['./wonernotification.component.css']
})
export class WonernotificationComponent implements OnInit {


  template:any='notification';

  tenentId:any
  tenentName:any;
  presentAddress:any;
  permanentAddress:any;
  phoneNo:any;
  email:any;
  ocupation:any;
  propertyId:any;
  landloardId:any

  date:any;
  time:any="Select Time";
  tourType:any="Select Tour Type";
  visitorId:any;
  tenant:any
  notificationStatus:any;
  notificationId:any;

  notification:any=[];
  constructor(private myservice:LoginService, private router:Router) {
    this.myservice.showallnotification().subscribe((x)=>{
      this.notification=x;
    })
   }

  ngOnInit(): void {
  }

  takeatour(i:any){
    
    this.template='tenantDetails';
    this.myservice.getTenantById(i.tenantId).subscribe((x)=>{
      this.tenant=x;
      this.tenentName=this.tenant.name;
    // alert("Name: "+this.tenentName);
    this.presentAddress=this.tenant.presentAddress;
    this.permanentAddress=this.tenant.permanentAddress;
    this.ocupation=this.tenant.occupation
    this.propertyId=i.propertyId;
    this.visitorId=i.tenantId;
    this.notificationId=i.notificationId;
    // alert("Property Id: "+this.propertyId);
    // alert("Visitor Id: "+this.visitorId);
    // window.open("/landloard/notification","")
    })
    
  }
  back(){
    this.template='notification';
  }
  
    detailsTosaveSchedule(){
      this.template='takeatour';
    }
  

  saveSchedule(){
    alert("works")
    this.notificationStatus="sheduled"
    this.myservice.saveShedule(this.date,this.time,this.tourType,this.propertyId,this.visitorId).subscribe(()=>{ alert("Schedule Save")
      this.myservice.updateNotification(this.notificationStatus,this.notificationId).subscribe(()=>{alert("Notification Update")})
    });
  }




}
