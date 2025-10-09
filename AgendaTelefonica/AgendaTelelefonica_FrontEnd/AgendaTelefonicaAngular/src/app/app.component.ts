import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { ViewGetComponent } from './Component/view-get/view-get.component';
import { MainComponent } from './Component/view-main/main/main.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterModule, ViewGetComponent, MainComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
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
