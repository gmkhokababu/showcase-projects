import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/visitor/home/home.component';
import { HeaderComponent } from './components/visitor/header/header.component';
import { FooterComponent } from './components/visitor/footer/footer.component';
import { AboutComponent } from './components/visitor/about/about.component';
import { LoginComponent } from './components/visitor/login/login.component';
import { LoginService } from './services/login.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminComponent } from './components/main/admin/admin.component';
import { NavComponent } from './components/main/nav/nav.component';
import { DashboardComponent } from './components/main/admin/dashboard/dashboard.component';
import { OurProjectsComponent } from './components/visitor/our-projects/our-projects.component';
import { RentComponent } from './components/visitor/rent/rent.component';
import { RentalFormComponent } from './components/visitor/rental-form/rental-form.component';
import { ListingFormComponent } from './components/visitor/listing-form/listing-form.component';
import { LandloardComponent } from './components/main/landloard/landloard.component';
import { LandloardDashboardComponent } from './components/main/landloard/landloard-dashboard/landloard-dashboard.component';
import { LandloardNavComponent } from './components/main/landloard/landloard-nav/landloard-nav.component';
import { AllpropertyComponent } from './components/main/landloard/allproperty/allproperty.component';
import { WonernotificationComponent } from './components/main/landloard/wonernotification/wonernotification.component';
import { SheduleComponent } from './components/main/landloard/shedule/shedule.component';
import { PrintAgreementComponent } from './components/print-agreement/print-agreement.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    AboutComponent,
    LoginComponent,
    AdminComponent,
    NavComponent,
    DashboardComponent,
    OurProjectsComponent,
    RentComponent,
    RentalFormComponent,
    ListingFormComponent,
    LandloardComponent,
    LandloardDashboardComponent,
    LandloardNavComponent,
    AllpropertyComponent,
    WonernotificationComponent,
    SheduleComponent,
    PrintAgreementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
