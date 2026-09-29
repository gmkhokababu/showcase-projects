import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Supplier } from '../Model/supplier';
import { Customer } from '../Model/customer';

@Injectable({
  providedIn: 'root'
})
export class ControllerrService {

  constructor(private http:HttpClient) { }
  url:any="http://localhost:8080/"

//save all supplier 
  saveSupplier(s:any):Observable<Supplier>{
    this.url="http://localhost:8080/save-supplier";
    return this.http.post<Supplier>(this.url,s);
  }

  //get all supplier 

  getAllSupplier():Observable<Supplier>{
    this.url="http://localhost:8080/get-all-suppliar";
    return this.http.get<Supplier>(this.url);
  }
  


  //==================================purchase=================================
  newpurchase(a:any):Observable<any>{
    this.url="http://localhost:8080/save-purchase";
    return this.http.post<any>(this.url,a);
  }
  //==================================purchase Return=================================
  purchaseReturn(a:any):Observable<any>{
    this.url="http://localhost:8080/purchase-return";
    return this.http.post<any>(this.url,a);
  }
  //==================================Damage=================================
  saveDamege(a:any):Observable<any>{
    this.url="http://localhost:8080/save-damage";
    return this.http.post<any>(this.url,a);
  }

   //==================================getDamegeList=================================

   getDamegeList(a:any):Observable<any>{
    this.url="http://localhost:8080/get-damage";
    return this.http.get<any>(this.url);
  }



  //==================================get all DamegeList=================================

  getallDamegeList(a:any):Observable<any>{
    this.url="http://localhost:8080/get-damage/"+a;
    return this.http.get<any>(this.url);
  }



  //========================================Stocck===============================
  addNewStock(s:any):Observable<any>{
    this.url="http://localhost:8080/add-new-stock";
    return this.http.post<any>(this.url,s);
  }


  getAllStockData():Observable<any>{
    this.url="http://localhost:8080/get-all-stock-data";
    return this.http.get<any>(this.url);
  }

  getAllStockDataByCatagory(s:any):Observable<any>{
    this.url="http://localhost:8080/get-all-stock-data"+"/"+s;
    return this.http.get<any>(this.url);
  }


//=============================================Customer Section======================================

saveAndGetCustomer(c:any):Observable<Customer>{
  this.url="http://localhost:8080/add-customer";
  return this.http.post<Customer>(this.url,c);
}

//==========================================Sale =====================================================
saveSale(sale:any):Observable<any>{
  this.url="http://localhost:8080/save-sale";
  return this.http.post<any>(this.url,sale);
}
//==========================================Save sale order =====================================================
saveOrder(sale:any):Observable<any>{
  this.url="http://localhost:8080/save-order";
  return this.http.post<any>(this.url,sale);
}

//==========================================Get orders =====================================================
getOrders(s:any):Observable<any>{
  this.url="http://localhost:8080/get-order/"+s;
  return this.http.get<any>(this.url);
}

//==========================================Get orders =====================================================
getOrderDetails(invoice:any,status:any):Observable<any>{
  this.url="http://localhost:8080/get-order-details/"+invoice+"/"+status;
  return this.http.get<any>(this.url);
}

//==========================================Get orders =====================================================
updateOrders(id:any,status:any):Observable<any>{
  this.url="http://localhost:8080/update-order/"+id+"/"+status;
  return this.http.get<any>(this.url);
}


//=================================Sale Repport=============================================
saleReport(startDate:any, endDate:any,type:any):Observable<any>{
  alert("controller")
  this.url="http://localhost:8080/sale-report/"+startDate+"/"+endDate+"/"+type;
  return this.http.get<any>(this.url);
}

//=================================Purchase Repport=============================================
purchaseReport(startDate:any, endDate:any,type:any,invoice:any):Observable<any>{
  alert("controller")
  this.url="http://localhost:8080/purchase-report/"+startDate+"/"+endDate+"/"+type+"/"+invoice;
  return this.http.get<any>(this.url);
}


purchaseReportforReturn(invoice:any):Observable<any>{
  alert("controller")
  this.url="http://localhost:8080/purchase-report/"+invoice;
  return this.http.get<any>(this.url);
}



//====================================================Transaction Part=======================================

//===========save Transaction======
saveTransaction(t:any){
  this.url="http://localhost:8080/save-transaction";
  return this.http.post<any>(this.url,t);
}






















}
