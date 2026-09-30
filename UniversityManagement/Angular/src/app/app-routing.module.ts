import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home/home.component';
import { LoginComponent } from './components/home/login/login.component';
import { AdminComponent } from './components/home/admin/admin.component';
import { AdminhomeComponent } from './components/admin/adminhome/adminhome.component';
import { ClassComponent } from './components/admin/class/class.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:AdminhomeComponent},
      {path:'dashboard',component:AdminhomeComponent},
      {path:'new-class',component:ClassComponent}
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
