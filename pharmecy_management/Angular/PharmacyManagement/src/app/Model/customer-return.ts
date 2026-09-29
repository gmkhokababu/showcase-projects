export class CustomerReturn {

     cus_returnId:any ;
	 stockId:any
	 qty:any
	 rate:any
	 total:any
	 saleDate:any
	 customerId:any

     constructor(cus_returnId:any,stockId:any, qty:any,rate:any,total:any ,saleDate:any,customerId:any  ){

        this.cus_returnId=cus_returnId
        this.stockId=stockId
        this.qty=qty
        this.rate=rate
        this.total=total
        this.saleDate=saleDate
        this.customerId=cus_returnId

     }



}
