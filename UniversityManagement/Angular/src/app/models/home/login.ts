export class Login {
    user_id:any;
    user_name:any;
    user_pass:any;
    table_id:any;
    constructor(id:any,usrName:any,password:any,tableId:any){
        this.user_id=id;
        this.user_name=usrName;
        this.user_pass=password;
        this.table_id=tableId;
    }
}
