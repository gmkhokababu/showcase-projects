// created by Abu Hossain on 03/09/2026
// last modified by Abu Hossain on 03/09/2026

import { Injectable, Service } from '@angular/core';
import { HttpClient } from '@angular/common/http';      
import { BehaviorSubject, Observable, map } from 'rxjs';


export interface User {
  id: number;
  username: string;
  password: string;
  role: string;
  token: string;
}

@Injectable({
    providedIn: 'root'
})
export class Auth {
    private apiUrl = 'http://localhost:8080/api/auth'; 
    private currentUserSubject: BehaviorSubject<User | null>;
    public currentUser: Observable<User | null>;

    constructor(private http: HttpClient) {
        const stored = localStorage.getItem('currentUser');
        this.currentUserSubject = new BehaviorSubject<User | null>(stored ? JSON.parse(stored) : null);
        this.currentUser = this.currentUserSubject.asObservable();
    }
    
    public get currentUserValue(): User | null {
        return this.currentUserSubject?.value;
    }

    login(username: string, password: string): Observable<User> {
        return this.http.post<any>(`${this.apiUrl}/login`, { username, password })
            .pipe(map(user => {
                if (user && user.token) {
                    localStorage.setItem('currentUser', JSON.stringify(user));
                    this.currentUserSubject?.next(user);
                }
                return user;
            }));
    }

    register(username: string, password: string): Observable<User> {
        return this.http.post<any>(`${this.apiUrl}/register`, { username, password })
            .pipe(map(user => {
                if (user && user.token) {
                    localStorage.setItem('currentUser', JSON.stringify(user));
                    this.currentUserSubject?.next(user);
                }
                return user;
            }));
    }

    logout(): void {    
        localStorage.removeItem('currentUser');
        this.currentUserSubject?.next(null);
    }

    isLoggedIn(): boolean {
        return !!this.currentUserValue;
    }

    isManager(): boolean {
        return this.currentUserValue?.role === 'manager';
    }
}
