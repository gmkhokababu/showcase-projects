import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from 'src/app/models/home/login';

@Injectable({
  providedIn: 'root'
})
export class HomeDataService {

  constructor(private http:HttpClient) { }

  url:any;
  teacherLogin(userName:any,password:any):Observable<Login>{

    this.url="http://localhost:8080/";
    return this.http.get<Login>(this.url+userName+"/"+password);

  }

}
