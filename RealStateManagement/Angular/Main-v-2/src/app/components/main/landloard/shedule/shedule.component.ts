import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-shedule',
  templateUrl: './shedule.component.html',
  styleUrls: ['./shedule.component.css']
})
export class SheduleComponent implements OnInit {

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

  allshedule:any=[];
  constructor(private myservice:LoginService, private router:Router) { 
    this.myservice.getShedule().subscribe((x)=>{
      this.allshedule=x;
    })
  }

  ngOnInit(): void {
  }

  //=====================================Agreement===========================================
  agreementId:any;
	landlordId:any;
	tenantId:any;
	monthlyFair:any;
	fiexdDepo:any;
	startDate:any;
	endDate:any;
	agreementType:any = "Agreement Type";
	rentalResponsibility:any;
	ownerResponsibility:any;
  payment:any;
  //rental resposibility
  rgas:any;
  rElectricity:any;
  rWater:any;
  rInternetCable:any;

  //rental resposibility
  ogas:any;
  oElectricity:any;
  oWater:any;
  oInternetCable:any;
  //==========================================================================================
  
  back(){
    this.template='notification';
  }
  //Shedule (scheduleId:any,name:any,email:any,phone:any,date:any,time:any,tourType:any,message:any,propertyId:any,visitorId:any)
  //tenant (id:any,name:any,presentAddress:any,permanentAddress:any,phoneNo:any,email:any,ocupation:any,propertyId:any)
  takeatour(i:any){
    
    this.template='tenantDetails';
    this.myservice.getTenantById(i.visitorId).subscribe((x)=>{
      this.tenant=x;
      this.tenentName=this.tenant.name;
    this.presentAddress=this.tenant.presentAddress;
    this.permanentAddress=this.tenant.permanentAddress;
    this.ocupation=this.tenant.occupation
    this.propertyId=i.propertyId;
    this.visitorId=i.tenantId;
    this.notificationId=i.notificationId;
    })
    
  }

  makkeAgreement(){
    this.template='makeagreement';
  }

  savePrintAgreement(){
    // window.open("/print-agreement")
    this.router.navigateByUrl("/print-agreement");
  }
  

}
