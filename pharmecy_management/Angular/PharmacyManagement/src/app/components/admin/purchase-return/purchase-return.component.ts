import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-purchase-return',
  templateUrl: './purchase-return.component.html',
  styleUrls: ['./purchase-return.component.css']
})
export class PurchaseReturnComponent implements OnInit {

  constructor(private myservice: ControllerrService) {

    if (new Date().getDate() < 10 && new Date().getMonth() + 1 < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth() + 1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getDate() < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth() + 1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getMonth() < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth() + 1).toString() + "-" + (new Date().getDate()).toString()
    } else {
      this.returnDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth() + 1).toString() + "-" + (new Date().getDate()).toString()
    }

  }

  ngOnInit(): void {
  }

  service:any="input-data";

  input(){
    this.service="input-data";
  }
  damageList(){
    this.service="damage-list";
  }
  returnList(){
    this.service="return-list";
  }

  returnDate: any;

  batchIdOrInvoice: any;
  search() {
    this.myservice.purchaseReportforReturn(this.batchIdOrInvoice).subscribe((x) => {
      alert("connect")
      this.purchaseReport = x;
    })
  }
  damageOrReturnQty: any;

  purchaseReport: any = [];
  returnProduct: any[] = [];
  damageProduct: any[] = [];
  // int purchasId, Date pursDate, Date return_date, int supllierId, String medicineName,
  // 		int paking, String genericName, int batchId, Date exDate, int qty, int mrp, double purchaseRate

  return: any = {
    returnId: 0,
    returnDate: "",
    supplier: "",
    medicineName: "",
    paking: "",
    genericName: "",
    batchId: "",
    exDate: "",
    pursDate: "",
    invoice: "",
    returnQty: 0,
    purchaseRate: "",
    status: "",
    purshasId: 0,
  }
  damage: any = {
    damageId: 0,
    damageDate: "",
    supplier: "",
    medicineName: "",
    paking: "",
    genericName: "",
    batchId: "",
    exDate: "",
    pursDate: "",
    invoice: "",
    returnQty: 0,
    purchaseRate: "",
    status: "",
    purshasId: 0,
  }

  // return: any = { returnId: 0, supplier: "Reneta", medicineName: "reneta", paking: 10, genericName: "ff", batchId: "1ewww", exDate: "2024-07-13", pursDate: "2024-06-07", invoice: "100010", returnQty: 0, status: "pending" };

  // damage: any = { damageId: 0, supplier: "Reneta", medicineName: "reneta", paking: 10, genericName: "ff", batchId: "1ewww", exDate: "2024-07-13", pursDate: "2024-06-07", invoice: "100010", damageQty: 0, status: "pending" };

  // [ { "pursDate": "2024-06-07", "supplier": "Reneta", "medicineName": "reneta", "paking": 10, "genericName": "ff", "batchId": "1ewww", "exDate": "2024-07-13", "qty": 100, "mrp": 300, "purchaseRate": 270, "invoice": "100010" } ]
  addreturn(i: any, qty: any) {
    this.return = new Object;
    this.return.returnId = 0;
    this.return.returnDate = "";
    this.return.supplier = i.supplier;
    this.return.medicineName = i.medicineName;
    this.return.paking = i.paking;
    this.return.genericName = i.genericName;
    this.return.batchId = i.batchId;
    this.return.exDate = i.exDate;
    this.return.pursDate = i.pursDate;
    this.return.invoice = i.invoice;
    this.return.returnQty = qty
    this.return.purchaseRate = i.purchaseRate;
    this.return.status = "Returend"
    this.return.purshasId = i.purchaseId;
    this.returnProduct.push(this.return);
    // this.damageOrReturnQty="";
  }

  adddamage(i: any, qty: any) {
    this.damage = new Object;
    this.damage.damageId = 0;
    this.damage.damageDate = "";
    this.damage.supplier = i.supplier;
    this.damage.medicineName = i.medicineName;
    this.damage.paking = i.paking;
    this.damage.genericName = i.genericName;
    this.damage.batchId = i.batchId;
    this.damage.exDate = i.exDate;
    this.damage.pursDate = i.pursDate;
    this.damage.invoice = i.invoice;
    this.damage.returnQty = qty
    this.damage.purchaseRate = i.purchaseRate;
    this.damage.status = "Damaged"
    this.damage.purshasId = i.purchaseId;
    this.damageProduct.push(this.damage);
    // this.damageOrReturnQty="";
  }


  updateValue(event: Event) {
    const inputElement = event.target as HTMLInputElement;
    this.damageOrReturnQty = inputElement.value;
    alert(this.damageOrReturnQty)
  }

  dropdown:any="inputselect";

  confirmReturn(){
    alert("are you sure to return")
    this.myservice.purchaseReturn(this.returnProduct).subscribe(()=>{
      alert("return confirm");
      this.returnProduct=[];
    })
  }

  saveDamage(){
    alert("are you sure to sent damage")
    this.myservice.saveDamege(this.damageProduct).subscribe(()=>{
      alert("Save to Damage");
      // this.returnProduct=[];
    })
  }

}
