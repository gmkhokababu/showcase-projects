import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LocationService {
  // Free API URL to get location data from client IP
  private apiUrl = 'https://ipapi.co/json/';

  constructor(private http: HttpClient) { }

  // Method to fetch user location/country info
  getUserLocation(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
