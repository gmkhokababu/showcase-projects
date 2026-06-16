import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { User } from '../../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
// environment থেকে অটোমেটিক মেইন ইউআরএল চলে আসবে
  private baseUrl = `${environment.apiUrl}/authentication`; 

  constructor(private http: HttpClient) { }

  login(credentials: User): Observable<any> {
    return this.http.post(`${this.baseUrl}/login`, credentials, {
      withCredentials: true
    });
  }

  register(user: User): Observable<any> {
    return this.http.post(`${this.baseUrl}/register`, user);
  }
}
