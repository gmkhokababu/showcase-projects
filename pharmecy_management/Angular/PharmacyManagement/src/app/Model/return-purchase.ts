export class ReturnPurchase {

     purchasId:any
	 pursDate:any
	 return_date:any
	 supllierId:any
	 medicineName:any
	 paking:any
	 genericName:any
	 batchId:any
	 exDate:any
	 qty:any
	 mrp:any
	 purchaseRate:any

     constructor(  purchasId:any , pursDate:any, return_date:any,supllierId:any, medicineName:any,paking:any, genericName:any, batchId:any, exDate:any,qty:any,mrp:any,purchaseRate:any  ){
        
        this.purchasId=purchasId
        this.pursDate=pursDate
        this.return_date=return_date
        this.supllierId=supllierId
        this.medicineName=medicineName
        this.paking=paking
        this.genericName=genericName
        this.batchId=batchId
        this.exDate=exDate
        this.qty=qty
        this.mrp=mrp
        this.purchaseRate=purchaseRate


     }

}
