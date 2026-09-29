import { AnonymousSubject } from "rxjs/internal/Subject"

export class User {

     purshasId:any
	 pursDate:any
	 supllierId:any
	 medicineName:any
	 paking:any
	 genericName:any
	 batchId:any
	 exDate:any
	 supplierId:any
	 qty:any
	 mrp:any
	 purchaseRate:any

     constructor(purshasId:any,pursDate:any,supllierId:any,medicineName:any,paking:any,
        genericName:any,batchId:any,exDate:any,supplierId:any,qty:any,mrp:any,purchaseRate:any

      ){

        this.purshasId=purshasId
        this.pursDate=pursDate
        this.supllierId=supllierId
        this.medicineName=medicineName
        this.paking=paking
        this.genericName=genericName
        this.batchId=batchId
        this.exDate=exDate
        this.supllierId=supllierId
        this.qty=qty
        this.mrp=mrp
        this.purchaseRate=purchaseRate

     }
}
