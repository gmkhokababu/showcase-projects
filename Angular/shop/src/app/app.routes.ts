import { Routes } from '@angular/router';
import { LoginComponent } from './Authentication/login/login.component';
import { RegistrationComponent } from './Authentication/registration/registration.component';

export const routes: Routes = [
    {path:'login', component: LoginComponent},
    {path: '', redirectTo: 'login', pathMatch: 'full'},
    {path: 'registration', component: RegistrationComponent},
];
