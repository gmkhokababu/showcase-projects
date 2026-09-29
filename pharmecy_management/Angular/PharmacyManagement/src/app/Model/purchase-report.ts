export class PurchaseReport {

     pursDate:any
	 supplier:any
	 medicineName:any
	 paking:any
	 genericName:any
	 batchId:any
	 exDate:any
	 qty:any
	 mrp:any
	 purchaseRate:any
	 invoice:any


    constructor(pursDate:any,supplier:any,medicineName:any,paking:any,genericName:any,batchId:any,exDate:any,qty:any,mrp:any, purchaseRate:any,invoice:any){
        this.pursDate=pursDate
        this.supplier=supplier
        this.medicineName=medicineName
        this.paking=paking
        this.genericName=genericName
        this.batchId=batchId
        this.exDate=exDate
        this.qty=qty
        this.mrp=mrp
        this.purchaseRate=purchaseRate
        this.invoice=invoice


    }
}
