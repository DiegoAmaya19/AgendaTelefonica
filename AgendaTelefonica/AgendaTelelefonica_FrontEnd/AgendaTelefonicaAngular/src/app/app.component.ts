import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterModule],
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
