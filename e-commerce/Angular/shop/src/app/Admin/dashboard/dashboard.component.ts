import { Component } from '@angular/core';
import { RouterOutlet } from "@angular/router";
import { SideNavComponent } from '../side-nav/side-nav.component';
import { TopNavComponent } from '../top-nav/top-nav.component';

@Component({
  selector: 'app-dashboard',
  imports: [
    RouterOutlet,
    SideNavComponent,
    TopNavComponent,
  ],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css',
})
export class DashboardComponent {

}
