export class Transaction {
    // transactionId:any;
    payId:any;
    date:any;
    amount:any;

    constructor( payId:any,date:any,amount:any){
        this.payId = payId;
        this.date = date;
        this.amount = amount;
    }

}
