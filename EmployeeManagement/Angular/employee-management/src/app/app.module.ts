import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { ControllerService } from './service/controller.service';
import { DepartmentsComponent } from './components/departments/departments.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    LoginComponent,
    AdminComponent,
    DashboardComponent,
    DepartmentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ControllerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
