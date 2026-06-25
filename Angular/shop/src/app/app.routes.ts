import { Routes } from '@angular/router';
import { LoginComponent } from './Authentication/login/login.component';
import { RegistrationComponent } from './Authentication/registration/registration.component';
import { DashboardComponent } from './Admin/dashboard/dashboard.component';
import { AdminHomeComponent } from './Admin/admin-home/admin-home.component';
import { PublicHomeComponent } from './public/public-home/public-home.component';
import { ProductHomeComponent } from './public/product-home/product-home.component';
import { ProductDetailsComponent } from './public/product-details/product-details.component';
import { TrackOrderComponent } from './public/track-order/track-order.component';
import { CartComponent } from './public/cart/cart.component';

export const routes: Routes = [
    { path: 'login', component: LoginComponent },
    {
        path: 'home', component: PublicHomeComponent,
        children: [
            { path: 'item', component: ProductHomeComponent },
            { path: '', redirectTo: 'item', pathMatch: 'full' },
        ]
    },
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'product-details', component: ProductDetailsComponent },
    { path: 'track-order', component: TrackOrderComponent },
    { path: 'cart', component: CartComponent },
    { path: 'registration', component: RegistrationComponent },
    {
        path: 'admin', component: DashboardComponent,
        children: [
            { path: 'home', component: AdminHomeComponent },
            { path: '', redirectTo: 'home', pathMatch: 'full' },
        ]

    },
];
