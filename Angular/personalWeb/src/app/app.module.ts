import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutComponent } from './components/about/about.component';
import { ServiceComponent } from './components/service/service.component';
import { PortfolioComponent } from './components/portfolio/portfolio.component';
import { ResumeComponent } from './components/resume/resume.component';
import { BlogComponent } from './components/blog/blog.component';
import { ContactComponent } from './components/contact/contact.component';
import { ShowBlogComponent } from './components/blog/show-blog/show-blog.component';
import { EditResumeComponent } from './components/resume/edit-resume/edit-resume.component';
import { EditPortfolioComponent } from './components/portfolio/edit-portfolio/edit-portfolio.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DataControllerService } from './service/data-controller.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    AboutComponent,
    ServiceComponent,
    PortfolioComponent,
    ResumeComponent,
    BlogComponent,
    ContactComponent,
    ShowBlogComponent,
    EditResumeComponent,
    EditPortfolioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DataControllerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
