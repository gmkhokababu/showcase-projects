export class UserOrder {
     orderId:any
	 invoiceNO:any
	 customerName:any
	 customerPhone:any
	 customerAddress:any
	 totalOrder:any

     constructor(orderId:any, invoiceNO:any,customerName:any,customerPhone:any, customerAddress:any,totalOrder:any ){

        this.orderId=orderId
        this.invoiceNO=invoiceNO
        this.customerName=customerName
        this.customerPhone=customerPhone
        this.customerAddress=customerAddress
        this.totalOrder=totalOrder
     }
}
