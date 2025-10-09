import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [FormsModule, CommonModule, RouterModule],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css',
})
export class MainComponent implements OnInit {
  navName: String = '';

  constructor() {}

  ngOnInit(): void {
    this.navName = 'Home';
  }

  changeNameToHome() {
    this.navName = 'Home';
  }

  changeNameIngresarContacto() {
    this.navName = 'Ingreso de Contacto';
  }

  changeNameRevisarContacto() {
    this.navName = 'Revisar Contacto';
  }

  changeNameActualizarContacto() {
    this.navName = 'Actualizar Contacto';
  }

  changeNameBuscarContacto() {
    this.navName = 'Buscar Contacto';
  }

  changeNameEliminarContacto() {
    this.navName = 'Eliminar Contacto';
  }
}
