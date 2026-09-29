import { Component, OnInit } from '@angular/core';
import { Supplier } from 'src/app/Model/supplier';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css']
})
export class SupplierComponent implements OnInit {

  constructor(private myservice:ControllerrService) { }

  ngOnInit(): void {
  }

  supllierId:any="";
	name:any;
	email:any;
	o_phone:any;
	contactPersion:any;
	contactPersionPhone:any;
   supplier:any;
   newSupplier(){
    this.supplier=new Supplier(this.supllierId,this.name,this.email,this.o_phone,this.contactPersion,this.contactPersionPhone);
   }

   saveSupplier(){
    this.newSupplier();
    this.myservice.saveSupplier(this.supplier).subscribe(()=>{
      alert("New Supplier Added!")
    });
	  this.name="";
	  this.email="";
	  this.o_phone="";
	  this.contactPersion="";
	  this.contactPersionPhone="";
   }

}
