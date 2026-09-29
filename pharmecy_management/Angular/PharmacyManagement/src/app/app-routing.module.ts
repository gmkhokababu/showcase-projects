import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { SupplierComponent } from './components/admin/supplier/supplier.component';
import { PurchaseComponent } from './components/admin/purchase/purchase.component';
import { SaleComponent } from './components/admin/sale/sale.component';
import { SaleReportComponent } from './components/admin/sale-report/sale-report.component';
import { PurchaseReportComponent } from './components/admin/purchase-report/purchase-report.component';
import { PurchaseReturnComponent } from './components/admin/purchase-return/purchase-return.component';
import { UserComponent } from './components/user/user.component';
import { AllProductsComponent } from './components/user/all-products/all-products.component';
import { OrdersComponent } from './components/admin/orders/orders.component';
import { ProcessOrdersComponent } from './components/admin/process-orders/process-orders.component';
import { DamageListComponent } from './components/admin/damage-list/damage-list.component';

const routes: Routes = [

{path:"",component:LoginComponent},
{path:"user",component:UserComponent,
  children:[
    {path:"",component:AllProductsComponent},
  ]
},
{path:"admin",component:AdminComponent,
  children:[
    {path:"supplier",component:SupplierComponent},
    {path:"purchase",component:PurchaseComponent},
    {path:"sale",component:SaleComponent},
    {path:"sale-report",component:SaleReportComponent},
    {path:"purchase-report",component:PurchaseReportComponent},
    {path:"purchase-return",component:PurchaseReturnComponent},
    {path:"orders",component:OrdersComponent},
    {path:"process-orders",component:ProcessOrdersComponent},
    {path:"damage-list",component:DamageListComponent},

  ],
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
