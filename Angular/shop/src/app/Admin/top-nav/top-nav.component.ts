import { Component } from '@angular/core';
import { SidebarService } from '../../services/sidebar.service';

@Component({
  selector: 'app-top-nav',
  imports: [],
  templateUrl: './top-nav.component.html',
  styleUrl: './top-nav.component.css'
})
export class TopNavComponent {
  constructor(private sidebarService: SidebarService) {}

  onMenuClick() {
    this.sidebarService.toggleSidebar();
  }

}
