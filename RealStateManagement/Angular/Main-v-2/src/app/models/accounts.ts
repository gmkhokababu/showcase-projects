export class Accounts {
    // idaccounts:any;
    userId:any;
    transactionId:any;
    amount:any; 
    transactionType:any;
    date:any;

    constructor(userId:any, transactionId:any,amount:any,transactionType:any,date:any){
        this.userId = userId;
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = date;
    }

}
