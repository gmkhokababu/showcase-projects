import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-sale-report',
  templateUrl: './sale-report.component.html',
  styleUrls: ['./sale-report.component.css']
})
export class SaleReportComponent implements OnInit {

  constructor(private myservice: ControllerrService) {
    this.getAllStockData();
  }

  ngOnInit(): void {
  }
  getAllStockData() {
    this.myservice.getAllStockData().subscribe((x) => {
      this.allStock = x;
    });
  }

  searchType: any=null;
  startDate: any;
  endDate: any;
  allStock: any = [];



  // Sale report  field

  saleReport: any = [];

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

  getSaleReport() {
    alert("start date " + this.startDate + "\n End Date " + this.endDate + "\n status " + this.searchType)
    this.myservice.saleReport(this.startDate, this.endDate, this.searchType).subscribe((x) => {
      this.saleReport = x;
      alert("ok")
    });
  }









}
