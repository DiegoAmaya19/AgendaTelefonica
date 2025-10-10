import { Component} from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterOutlet} from '@angular/router';
import { DatosService } from '../../Services/datos.service';
import { ContactoRequest } from '../../Model/contacto-request';
import { FormsModule } from '@angular/forms';
import { ContactoResponse } from '../../Model/contacto-response';

@Component({
  selector: 'app-view-post',
  standalone: true,
  imports: [RouterModule, CommonModule, FormsModule],
  templateUrl: './view-post.component.html',
  styleUrl: './view-post.component.css'
})
export class ViewPostComponent {

  response: ContactoResponse = {
    nombre: '',
    apellido: '',
    grupo: '',
    direccion: '',
    email: '',
    numero: ''
  };

  contactoRequest: ContactoRequest = {
    primerNombre: '',
    segundoNombre: '',
    primerApellido: '',
    segundoApellido: '',
    grupo: '',
    direccion: '',
    email: '',
    indicativo: '',
    numero: '',

  }

  constructor(private datosService: DatosService){};

  crearContacto(){

    // this.contactoRequest.primerNombre = "Gabriel";
    // this.contactoRequest.segundoNombre = "Alfonso";
    // this.contactoRequest.primerApellido = "Armando";
    // this.contactoRequest.segundoApellido = "Torres";
    // this.contactoRequest.grupo = "Familia";
    // this.contactoRequest.direccion = "Calle 33 # 22";
    // this.contactoRequest.email = "alfonso@gmail.com";
    // this.contactoRequest.indicativo = "+57";
    // this.contactoRequest.numero = "345355555";

    this.datosService.crearContacto(this.contactoRequest).subscribe((r) =>{

      this.response.nombre = r.nombre;
      this.response.apellido = r.apellido;
      this.response.grupo = r.grupo;
      this.response.direccion = r.direccion;
      this.response.email = r.email;
      this.response.numero = r.numero;

    })

        // this.datosService.crearContacto(this.contactoRequest).subscribe({
        //   next: (r) => {
        //     console.log('Contactos creados con exito');
        //   },
        //   error: (er) => {
        //     er.error('');
        //   },
        // });
        
  }

}
