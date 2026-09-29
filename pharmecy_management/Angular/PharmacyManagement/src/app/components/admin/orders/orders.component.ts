import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  constructor(private myservice:ControllerrService) {
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    })

   }

  ngOnInit(): void {
  }
  status:any="Requested"

  service:any="order-summery";

  orderSummary:any=[];
  orderDetails:any=[];

  subTotal:any;
  customerName:any;
  customerPhone:any;
  customerAddress:any;
  date:any;
  payment:any;

  cancelOrder(orderId:any,invoiceNo:any){
    this.status="Canceled"
    // alert("Hellow "+orderId+"\n Invoice NO: "+invoiceNo)
    this.myservice.updateOrders(orderId,this.status).subscribe(()=>{
      alert("Canceled");
      this.showDetails(invoiceNo);
    });
    this.status="Requested"
  }

  cancelallORders(){
    for(let i of this.orderDetails){
       this.cancelOrder(i.orderId,i.invoice);
    }
    this.status="Requested";
    
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    });
    this.service="order-summery";

  }



  showOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }


  prcessingOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }


  cancelOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }



  confirmOrder(){
    this.status="Processing"
    for(let i of this.orderDetails){
      this.myservice.updateOrders(i.orderId,this.status).subscribe(()=>{
        this.showDetails(i.invoice);
      })
    }
    this.status="Requested";
    this.service="order-summery";
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    })
  }

  sales: any[] = [];
  sale: any = { saleId: "", stockId: "", qty: "", rate: "", total: "", saleDate: "", customerId: "",invoice_no:"" };
  transaction:any={transactionId:0,  transactionDate:"", invoice_no:"",  purpose:"",  transactionType:"", ammount:0};
  // "invoice": "20240711033102", "medicineName": "Rupatadine", "genericName": "Rupa", "supplier": "Aristopharma", "qty": 5, "rate": 54, "total": 270, "customerName": "Abu Hossain", "phone": "01516718442", "address": "Green Road", "stockId": 7, "orderId": 9, "saleDate": "2024-07-11", "status": "Processing", "customerId": 1 }
  confirmSale(){
    let transactionTotal=0;
    let invoice_No="";
    for(let i=0;i<this.orderDetails.length;i++){
      this.sale=new Object;
      this.sale.saleId="";
      this.sale.stockId=this.orderDetails.at(i).stockId;
      this.sale.qty=this.orderDetails.at(i).qty;
      this.sale.rate=this.orderDetails.at(i).rate;
      this.sale.total=this.orderDetails.at(i).total;
      this.sale.saleDate=this.orderDetails.at(i).saleDate;
      this.sale.customerId=this.orderDetails.at(i).customerId;
      this.sale.invoice_no=this.orderDetails.at(i).invoice;
      this.sales.push(this.sale);
      transactionTotal=transactionTotal+this.orderDetails.at(i).total;
      invoice_No=this.orderDetails.at(i).invoice;
    }
    // ===============Transaction start========
    this.transaction=new Object;
    this.transaction.transactionId=0;
    this.transaction.transactionDate=0;
    this.transaction.invoice_no=invoice_No;
    this.transaction.purpose="Sale";
    this.transaction.transactionType="Credit";
    this.transaction.ammount=transactionTotal;
    this.myservice.saveTransaction(this.transaction).subscribe(()=>{
      alert("Transaction Save")
    })

    // ===============Transaction End========

    this.myservice.saveSale(this.sales).subscribe(() => {
      alert("Thank you");
      this.sales = [];
    });
    this.status="Sold"
    for(let i of this.orderDetails){
      this.myservice.updateOrders(i.orderId,this.status).subscribe(()=>{
        this.showDetails(i.invoice);
      })
    }
    this.status="Requested";
    this.service="order-summery";
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    })
  }



  showDetails(invoiceNo:any){
    // this.status="Requested";
    this.myservice.getOrderDetails(invoiceNo,this.status).subscribe((x)=>{
      this.orderDetails=x;
      this.subTotal=0;
      for(let i of this.orderDetails){
        this.subTotal=this.subTotal+i.total;
        this.customerName=i.customerName;
        this.customerPhone=i.phone;
        this.customerAddress=i.address;
        this.date=i.saleDate;
      }
    })

    this.service="order-details";
  }
  goto(i:any){
    this.service="order-summery";
  }
}
