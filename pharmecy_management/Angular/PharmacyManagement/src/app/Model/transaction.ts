export class Transaction {
     transactionId:any
	 transactionDate:any
	 purpose:any
	 transactionType:any
	 ammount:any

     constructor( transactionId:any,transactionDate:any,purpose:any,transactionType:any,ammount:any){
        this.transactionId=transactionId
        this.transactionDate=transactionDate
        this.purpose=purpose
        this.transactionType=transactionType
        this.ammount=ammount
        

     }
}
