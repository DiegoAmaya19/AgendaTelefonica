import { Component, OnInit } from '@angular/core';
import { DatosService } from '../../Services/datos.service';
import { CommonModule } from '@angular/common';
import { NgFor } from '@angular/common';
import { ContactoResponse } from '../../Model/contacto-response';
import { RouterModule, RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-view-get',
  standalone: true,
  imports: [CommonModule, NgFor, RouterModule],
  templateUrl: './view-get.component.html',
  styleUrl: './view-get.component.css'
})

export class ViewGetComponent implements OnInit {

  datos: ContactoResponse[] = [];

  constructor(private datosService: DatosService) { }

  ngOnInit(): void {
    this.cargarDatos();
  }

  cargarDatos(): void {
    this.datosService.obtenerContactos().subscribe({
      next: (resp) => {
        this.datos = resp;
      },
      error: (error) => {
        console.error('Error al obtener los datos', error);
      }
    });
  }
}