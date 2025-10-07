import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ViewGetComponent } from './Component/view-get/view-get.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ViewGetComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AgendaTelefonicaAngular';
}
