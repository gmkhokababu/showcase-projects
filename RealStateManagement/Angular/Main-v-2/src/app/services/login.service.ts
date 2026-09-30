import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { Observable } from 'rxjs';
import { Tenant } from '../models/tenant';
import { Property } from '../models/property';
import { Scheduleatour } from '../models/scheduleatour';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  url:any="http://localhost:8080/"
  login(userName:any,password:any):Observable<User>{
    this.url=this.url+userName+"/"+password;
    return this.http.get<User>(this.url);
  }

  //-----------------------------create user--------------------------
  createuser(u:User):Observable<User>{
    this.url="http://localhost:8080/create-user";
    return this.http.post<User>(this.url,u);
  }

  //----------------------------create tenant---------------------------
  createtenent(u:Tenant):Observable<Tenant>{
    this.url="http://localhost:8080/create-tenent";
    return this.http.post<Tenant>(this.url,u);
  }

  //---------------------save property---------------------------------
  saveproperty(p:Property):Observable<Property>{
    this.url="http://localhost:8080/postproperty";
    return this.http.post<Property>(this.url,p);
  }

  //---------------------Show all property------------------------------
  showall():Observable<Property>{
    this.url="http://localhost:8080/getproperty";
    return this.http.get<Property>(this.url);
  }
//=========================Tenant==========================================
  //---------------------Create Tenant---------------------
  createTenant(tenant:any):Observable<Tenant>{
    this.url="http://localhost:8080/create-tenent";
    return this.http.post<Tenant>(this.url,tenant);
  }

   //---------------------Create Tenant---------------------

   getTenantById(id:any):Observable<Tenant>{
    this.url="http://localhost:8080/tenant/"+id;
    return this.http.get<Tenant>(this.url);
  }




  //-----------------------save Notification---------------------
  saveNotification(phone:any,landloardId:any):Observable<Notification>{
    this.url="http://localhost:8080/save-notification/"+phone+"/"+landloardId;
    return this.http.get<Notification>(this.url);
  }


  updateNotification(status:any,id:any):Observable<Notification>{
    this.url="http://localhost:8080/update-notification/"+status+"/"+id;
    return this.http.get<Notification>(this.url);
  }


  //show all notification

  showallnotification():Observable<Notification>{
    this.url="http://localhost:8080/get-notification";
    return this.http.get<Notification>(this.url);
  }

//===============================create a schedule===================================

saveShedule(date:any,time:any,tourtype:any,propertyId:any,visitorId:any):Observable<Scheduleatour>{
  this.url="http://localhost:8080/save-schedule/"+date+"/"+time+"/"+tourtype+"/"+propertyId+"/"+visitorId;
    return this.http.get<Scheduleatour>(this.url);
}

getShedule():Observable<Scheduleatour>{
  this.url="http://localhost:8080/all-schedule";
    return this.http.get<Scheduleatour>(this.url);
}











}
