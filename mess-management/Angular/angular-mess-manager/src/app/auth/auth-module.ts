// created by Abu Hossain on 03/09/2026
// last modified by Abu Hossain on 03/09/2026

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AuthRoutingModule } from './auth-routing-module';
import { Login } from './login/login';

@NgModule({
  declarations: [],
  imports: [
    CommonModule, 
    AuthRoutingModule,
    HttpClientModule,
    RouterModule
  ],
  exports: []
})
export class AuthModule {}
