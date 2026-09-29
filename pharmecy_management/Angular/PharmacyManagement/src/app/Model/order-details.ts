export class OrderDetails {
     orderDetailsId:any
	 invoice:any
	medicineName:any;
	genericName:any;
	supplier:any;
	 qty:any
	 rate:any
	 total:any
     customerName:any;
     phone:any;
     address:any;
     stockId:any;

     constructor(orderDetailsId:any,invoice:any,qty:any,rate:any,total:any,stockId:any,customerId:any,status:any){
        this.orderDetailsId=orderDetailsId
        this.invoice=invoice
        this.qty=qty
        this.rate=rate
        this.total=total
        this.stockId=stockId
     }
}
