import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { User } from '../../entity/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
// url come from environment file
  private baseUrl = `${environment.apiUrl}`; 

  constructor(private http: HttpClient) { }

  login(credentials: User): Observable<any> {
    return this.http.post(`${this.baseUrl}/api/auth/login`, credentials, {
      withCredentials: true
    });
  }

  register(user: User): Observable<any> {
    return this.http.post(`${this.baseUrl}/api/auth/register`, user);
  }

  
}
