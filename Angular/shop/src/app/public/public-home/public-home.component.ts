import { Component } from '@angular/core';
import { PublicTopNavComponent } from '../public-top-nav/public-top-nav.component';
import { PublicSideNavComponent } from '../public-side-nav/public-side-nav.component';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-public-home',
  imports: [
    PublicTopNavComponent,
    PublicSideNavComponent,
    RouterOutlet
  ],
  templateUrl: './public-home.component.html',
  styleUrl: './public-home.component.css'
})
export class PublicHomeComponent {

}
