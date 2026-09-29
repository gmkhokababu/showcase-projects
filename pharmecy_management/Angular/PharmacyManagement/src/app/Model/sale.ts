export class Sale {

    saleId:any
	 stockId:any
	 qty:any
	 rate:any
	 total:any
	 saleDate:any
	 customerId:any
    invoice_no:any;
    status:any

     constructor(saleId:any,stockId:any, qty:any, rate:any , total:any, saleDate:any, customerId:any,invoice_no:any,status:any){
        this.saleId=saleId
        this.stockId=stockId
        this.qty=qty
        this.rate=rate
        this.total=total
        this.saleDate=saleDate
        this.customerId=customerId
        this.invoice_no=invoice_no;
        this.status=status
        

     }


}
