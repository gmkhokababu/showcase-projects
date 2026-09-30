import { SheduleComponent } from "../components/main/landloard/shedule/shedule.component";

export class Scheduleatour {
    scheduleId:any;
    name:any;
	email:any;
	phone:any;
	date:any;
	time:any;
	tourType:any;
	message:any;
	propertyId:any;
	visitorId:any;
    constructor(scheduleId:any,name:any,email:any,phone:any,date:any,time:any,tourType:any,message:any,propertyId:any,visitorId:any){
        this.scheduleId=scheduleId;
        this.name=name;this.email=email;
        this.phone=phone;
        this.date=date;
        this.time=time;
        this.tourType=tourType;
        this.message=message;
        this.propertyId=propertyId;
        this.visitorId=visitorId;
    }
}
