export class Notification {
    notificationId:any;
	propertyId:any;
	tenantId:any;
	notificationStatus:any;
	landloardId:any;
    constructor(notificationId:any,propertyId:any,tenantId:any,notificationStatus:any,landloardId:any){
        this.notificationId=notificationId;
        this.propertyId=propertyId;
        this.tenantId=tenantId;
        this.notificationStatus=notificationStatus;
        this.landloardId=landloardId;
    }
}
