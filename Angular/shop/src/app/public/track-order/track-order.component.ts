import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { PublicTopNavComponent } from '../public-top-nav/public-top-nav.component';

@Component({
  selector: 'app-track-order',
  imports: [
    CommonModule,
    PublicTopNavComponent,
  ],
  templateUrl: './track-order.component.html',
  styleUrl: './track-order.component.css'
})
export class TrackOrderComponent {

}
