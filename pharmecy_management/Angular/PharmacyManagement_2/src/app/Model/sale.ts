export class Sale {

     saleId:any
	 stockId:any
	 qty:any
	 rate:any
	 total:any
	 saleDate:any
	 customerId:any

     constructor(saleId:any,stockId:any, qty:any, rate:any , total:any, saleDate:any, customerId:any){
        this.saleId=saleId
        this.stockId=stockId
        this.qty=qty
        this.rate=rate
        this.total=total
        this.saleDate=saleDate
        this.customerId=customerId
        

     }


}
