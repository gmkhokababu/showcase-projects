// created by Abu Hossain on 03/09/2026
// last modified by Abu Hossain on 03/09/2026

import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot } from '@angular/router';
import { Auth } from './auth';

@Injectable({providedIn: 'root'})
export class authGuard implements CanActivate {
  constructor(private router: Router, private authService: Auth) {}
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
   const currentUser = this.authService.currentUserValue;
    if (currentUser) {
      const expectedRole = route.data['role'];
      if (expectedRole && currentUser.role !== expectedRole) {
        this.router.navigate(['/dashboard']);
        return false;
      }
      return true;
    }
    this.router.navigate(['/login'], { queryParams: { returnUrl: state.url } });
    return false;
  }
}
