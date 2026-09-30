import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home/home.component';
import { LoginComponent } from './components/home/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeDataService } from './services/home/home-data.service';
import { HeaderComponent } from './components/home/header/header.component';
import { FooterComponent } from './components/home/footer/footer.component';
import { AdminComponent } from './components/home/admin/admin.component';
import { SidenavComponent } from './components/admin/sidenav/sidenav.component';
import { AdminhomeComponent } from './components/admin/adminhome/adminhome.component';
import { ClassComponent } from './components/admin/class/class.component';
import { AdminHeaderComponent } from './components/admin/admin-header/admin-header.component';
import { AdminDataService } from './services/admin/admin-data.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    AdminComponent,
    SidenavComponent,
    AdminhomeComponent,
    ClassComponent,
    AdminHeaderComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    HomeDataService,
    AdminDataService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
