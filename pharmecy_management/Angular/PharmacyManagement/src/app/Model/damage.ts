export class Damage {

     damageId:any  ;
     damageDate:any;
	 supllierId:any ;
	 medicineName:any ;
	 paking:any ;
	 genericName:any ;
	 batchId:any ;
	 exDate:any ;
	 qty:any ;
	 mrp:any ;
	 purchaseRate:any;

     constructor( damageId:any , damageDate:any, supllierId:any,medicineName:any,paking:any,  genericName:any,  batchId:any ,  exDate:any , qty:any , mrp:any  , purchaseRate:any 
       ){

        this.damageId=damageId
        this.damageDate=damageDate
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
