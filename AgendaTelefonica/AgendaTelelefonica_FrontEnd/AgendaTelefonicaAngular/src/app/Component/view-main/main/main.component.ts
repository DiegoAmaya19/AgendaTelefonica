import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css',
})
export class MainComponent {
  navName: String = "HJJ";

  constructor(){};

  ngOnInit(): void {
    this.navName = "Home";
  }

  changeNameToHome(){
    this.navName = "Home";
  }

  changeNameIngresarContacto(){
    this.navName = "Ingreso de Contacto";
  }
}
