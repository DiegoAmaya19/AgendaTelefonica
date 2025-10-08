import { Component} from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterOutlet} from '@angular/router';
import { DatosService } from '../../Services/datos.service';
import { ContactoRequest } from '../../Model/contacto-request';
import { FormsModule} from '@angular/forms';

@Component({
  selector: 'app-view-post',
  standalone: true,
  imports: [RouterModule, CommonModule, FormsModule],
  templateUrl: './view-post.component.html',
  styleUrl: './view-post.component.css'
})
export class ViewPostComponent {

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

  letras: string = 'ddedede';

  constructor(private datosService: DatosService){};

  crearContacto(){

    this.contactoRequest.primerNombre = "Goku";
    this.contactoRequest.primerApellido = "Sayan";
    this.contactoRequest.grupo = "Familia";
    this.contactoRequest.direccion = "Planeta Vegeta";
    this.contactoRequest.email = "goku@gmail.com";
    this.contactoRequest.indicativo = "+777";
    this.contactoRequest.numero = "774434347";

    this.datosService.crearContacto(this.contactoRequest).subscribe({
      next:(r) => {
        console.log('Contactos creados con exito');
      },
      error: (er) => {
        er.error('');
      }
    });

    console.log(this.contactoRequest.primerNombre);
  }

}
