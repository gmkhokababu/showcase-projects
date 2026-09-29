export class SaleReport {

    supplier: any
    medicine: any
    generic: any
    batch: any
    customer: any
    Phone: any
    qty: any
    rate: any
    total: any
    date: any
    invoice_no:any;

    constructor(supplier: any, medicine: any, generic: any, batch: any, customer: any, Phone: any, qty: any, rate: any, total: any, date: any,invoice_no:any) {

        this.supplier = supplier
        this.medicine = medicine
        this.generic = generic
        this.batch = batch
        this.customer = customer
        this.Phone = Phone
        this.qty = qty
        this.rate = rate
        this.total = total
        this.date = date
        this.invoice_no=invoice_no;
    }

}
