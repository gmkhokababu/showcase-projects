import { Component, OnInit } from '@angular/core';
import { Purchase } from 'src/app/Model/purchase';
import { Stock } from 'src/app/Model/stock';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-purchase',
  templateUrl: './purchase.component.html',
  styleUrls: ['./purchase.component.css']
})
export class PurchaseComponent implements OnInit {

  constructor(private myservice:ControllerrService) { 
    this.myservice.getAllSupplier().subscribe((x)=>{
      this.allSupplier=x;
    })
    if(new Date().getDate()<10 && new Date().getMonth()+1<10){
      this.pursDate=new Date().getFullYear().toString()+"-"+"0"+new Date().getMonth().toString()+"-"+"0"+(new Date().getDate()).toString()
    }else if(new Date().getDate()<10){
      this.pursDate=new Date().getFullYear().toString()+"-"+new Date().getMonth().toString()+"-"+"0"+(new Date().getDate()).toString()
    }else if(new Date().getMonth()<10){
      this.pursDate=new Date().getFullYear().toString()+"-"+"0"+new Date().getMonth().toString()+"-"+(new Date().getDate()).toString()
    }else{
      this.pursDate=new Date().getFullYear().toString()+"-"+new Date().getMonth().toString()+"-"+(new Date().getDate()).toString()
    }
    // alert(this.pursDate)
  }
  date:any=new Date();
  ngOnInit(): void {
    
    
  }
  stockId:any;
   purshasId:any;
	 pursDate:any;
	 supllierId:any;
   supplierName:any;
	 medicineName:any;
	 paking:any;
	 genericName:any;
	 batchId:any;
	 exDate:any;
	 qty:any;
	 mrp:any;
	 purchaseRate:any;
   saleRate:any;
   saleRateppcs:any;
   invoice:any

   totalpack:any;

   allPurchase:any[]=[];
   allPurchaseList:any[]=[];
   purchaseList:any={supplierName:"",medicineName:"",genericName:"",packingQty:"",batchId:"",exDate:"",totalpack:"",mrp:"",purchaseRate:"",saleRate:""};

   allstock:any[]=[];

   allSupplier:any=[];
   setSupplierId(i:any){
    this.supllierId=this.allSupplier[i].supllierId;
    this.supplierName=this.allSupplier[i].name;
    // alert("Supplier Id is => "+this.supplierName);
   }
   showMonth(){
    alert(this.exDate)
   }
   purchase:any;
  //  purchase
  //  (purshasId:any,pursDate:any, supllierId:any,  medicineName:any,paking:any, genericName:any, batchId:any, exDate:any,
  // qty:any,mrp:any, purchaseRate:any)
   newPurchase(){
    this.qty=(parseInt(this.paking)*parseInt(this.totalpack));
    // alert(this.totalqty);
    this.purchase=new Purchase(this.purshasId,this.pursDate,this.supllierId,this.medicineName,this.paking,this.genericName,this.batchId,this.exDate,this.qty,this.mrp,this.purchaseRate,this.invoice);
    this.allPurchase.push(this.purchase);
    this.purchaseList=new Object;
    this.purchaseList.supplierName=this.supplierName;
    this.purchaseList.medicineName=this.medicineName;
    this.purchaseList.genericName=this.genericName;
    this.purchaseList.packingQty=this.paking;
    this.purchaseList.batchId=this.batchId;
    this.purchaseList.exDate=this.exDate;
    this.purchaseList.totalpack=this.totalpack;
    this.purchaseList.mrp=this.mrp;
    this.purchaseList.purchaseRate=this.purchaseRate;
    this.purchaseList.saleRate=this.saleRate;
    this.allPurchaseList.push(this.purchaseList);
    this.newStock();
    //=====================field empty process
    this.medicineName="";
    this.genericName="";
    this.paking="";
    this.batchId="";
    this.exDate="";
    this.totalpack="";
    this.mrp="";
    this.purchaseRate="";
    this.saleRate="";
   }


// (stockId:any, medicineName:any, paking:any,  genericName:any , batchId:any, ex_date:any,  supplier:any,qty:any,mrp:any,  rate:any)
   stock:any;
   allStock:any[]=[];
   newStock(){
    this.saleRateppcs=parseInt(this.saleRate)/parseInt(this.paking)
    alert("Rate per pcs => "+this.saleRateppcs);
    this.stock=new Stock(this.stockId,this.medicineName,this.paking,this.genericName,this.batchId,this.exDate,this.supplierName,this.qty,this.mrp,this.saleRateppcs);
    this.allStock.push(this.stock);
   }

   savePurchase(){
    this.myservice.newpurchase(this.allPurchase).subscribe(()=>{
      alert("Purched Ok!")
    });
    this.myservice.addNewStock(this.allStock).subscribe(()=>{
      alert("Stock Update!");
    });
    this.allPurchaseList=[];
   }
   


}
