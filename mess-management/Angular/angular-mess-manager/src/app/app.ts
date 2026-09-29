import { Component, signal } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { Auth } from './auth/auth';

@Component({
  imports: [RouterOutlet],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('angular-mess-manager');
   constructor(public authService: Auth, private router: Router) {}

  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }
}
