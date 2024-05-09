import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Blog } from '../models/blog';

@Injectable({
  providedIn: 'root'
})
export class DataControllerService {

  url:any="http://localhost:8080/";
  constructor(private http:HttpClient) { }

  public createpost(blog:Blog):Observable<Blog>{
    alert("Posted")
    this.url="http://localhost:8080/createblog";
    // this.url=this.url+"createblog";
    alert(this.url)
    return this.http.post<Blog>(this.url,blog);

  }

  public allpost():Observable<Blog>{
    this.url="http://localhost:8080/allblogs";

    // this.url=this.url+"allblogs";
    return this.http.get<Blog>(this.url);
  }
}
