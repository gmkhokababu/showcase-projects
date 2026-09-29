import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-purchase-report',
  templateUrl: './purchase-report.component.html',
  styleUrls: ['./purchase-report.component.css']
})
export class PurchaseReportComponent implements OnInit {

  constructor(private myservice:ControllerrService) { 
    this.myservice.getAllStockData().subscribe((x)=>{
      this.allStock=x;
    })
  }

  ngOnInit(): void {
  }

  getSaleReport(){
    this.myservice.purchaseReport(this.startDate,this.endDate,this.searchType,this.voucher_no).subscribe((x)=>{
      alert("connect")
      this.purchaseReport=x;
    })

  }
  voucher_no:any=null;
  
  searchType: any=null;
  startDate: any;
  endDate: any;
  allStock: any = [];
  // Sale report  field

  purchaseReport: any = [];

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

  setMedicineName(i: any) {
    this.searchType = this.allStock[i].medicineName;
  }
  setGenericName(i: any) {
    this.searchType = this.allStock[i].genericName;
  }

  setBatchid(i: any) {
    this.searchType = this.allStock[i].batchId;
  }
  setSupplierName(i: any) {
    this.searchType = this.allStock[i].supplier;
  }

}
