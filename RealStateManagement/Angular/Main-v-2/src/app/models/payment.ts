export class Payment {
    
    ownerId:any;
    buyerId:any;
    serviceType:any;
    signDate:any;
    attachment:any;
    propertyId:any;

    constructor(ownerId:any,buyerId:any,serviceType:any,signDate:any, attachment:any,propertyId:any){
        this.ownerId = ownerId;
        this.buyerId = buyerId;
        this.serviceType = serviceType;
        this.signDate = signDate;
        this.attachment = attachment;
        this.propertyId = propertyId;
    }

}
