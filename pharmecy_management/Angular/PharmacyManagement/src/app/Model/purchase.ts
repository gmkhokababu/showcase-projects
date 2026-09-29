export class Purchase {
    purshasId:any;
	 pursDate:any;
	 supllierId:any;
	 medicineName:any;
	 paking:any;
	 genericName:any;
	 batchId:any;
	 exDate:any;
	 qty:any;
	 mrp:any;
	 purchaseRate:any;
   invoice:any




     constructor(purshasId:any,pursDate:any, supllierId:any,  medicineName:any,paking:any, genericName:any, batchId:any, exDate:any,
         qty:any,mrp:any, purchaseRate:any,  invoice:any
      ){
        this.purshasId=purshasId
        this.pursDate=pursDate
        this.supllierId=supllierId
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
