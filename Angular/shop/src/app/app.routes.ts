import { Routes } from '@angular/router';
import { LoginComponent } from './Authentication/login/login.component';
import { RegistrationComponent } from './Authentication/registration/registration.component';
import { DashboardComponent } from './Admin/dashboard/dashboard.component';
import { AdminHomeComponent } from './Admin/admin-home/admin-home.component';

export const routes: Routes = [
    {path:'login', component: LoginComponent},
    {path: '', redirectTo: 'login', pathMatch: 'full'},
    {path: 'registration', component: RegistrationComponent},
    {path: 'admin', component: DashboardComponent,
        children:[
            {path: 'home', component: AdminHomeComponent},
            {path: '', redirectTo:'home', pathMatch: 'full'},
        ]
        
       },
];
