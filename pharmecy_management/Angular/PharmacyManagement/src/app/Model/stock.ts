export class Stock {
   stockId:any
   medicineName:any;
	 paking:any
	 genericName:any
	 batchId:any
	 ex_date:any
	 supplier:any
	 qty:any
	 mrp:any
	 rate:any

     constructor(stockId:any, medicineName:any, paking:any,  genericName:any , batchId:any, ex_date:any,  supplier:any,qty:any,mrp:any,  rate:any){

        this.stockId=stockId
        this.medicineName=medicineName;
        this.paking=paking
        this.genericName=genericName
        this.batchId=batchId
        this.ex_date=ex_date
        this.supplier=supplier
        this.qty=qty
        this.mrp=mrp
        this.rate=rate
     }


}
