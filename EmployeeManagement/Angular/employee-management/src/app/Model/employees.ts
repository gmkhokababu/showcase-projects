export class Employees {
    employeeId:any;
	name:any;
	email:any;
	phoneNo:any;
	departmentId:any;
	roleId:any;
	dateOfJoining:any;
	salary:any;
	address:any;
    constructor(employeeId:any,name:any,email:any,phoneNo:any,departmentId:any,roleId:any,dateOfJoining:any,salary:any,address:any){

        this.employeeId=employeeId;
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
        this.departmentId=departmentId;
        this.roleId=roleId;
        this.dateOfJoining=dateOfJoining;
        this.salary=salary;
        this.address=address;
    }
}
