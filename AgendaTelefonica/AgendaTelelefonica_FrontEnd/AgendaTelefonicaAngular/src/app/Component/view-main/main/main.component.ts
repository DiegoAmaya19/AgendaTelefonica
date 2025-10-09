import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule, NgClass } from '@angular/common';
import { RouterLink } from "@angular/router";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [FormsModule, CommonModule, RouterLink],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css',
})
export class MainComponent {
  navName: String = "";

  constructor() { };

  ngOnInit(): void {
    this.navName = "Home";
  }

  changeNameToHome() {
    this.navName = "Home";
  }

  changeNameIngresarContacto() {
    this.navName = "Ingreso de Contacto";
  }

  changeNameRevisarContacto() {
    this.navName = "Revisar Contacto";
  }

  changeNameActualizarContacto() {
    this.navName = "Actualizar Contacto";
  }

  changeNameBuscarContacto() {
    this.navName = "Buscar Contacto";
  }

  changeNameEliminarContacto() {
    this.navName = "Eliminar Contacto";
  }

}