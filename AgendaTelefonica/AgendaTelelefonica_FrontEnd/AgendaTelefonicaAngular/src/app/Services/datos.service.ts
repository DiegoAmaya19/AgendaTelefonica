import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ContactoResponse } from '../Model/contacto-response';
import { ContactoRequest } from '../Model/contacto-request';

@Injectable({
  providedIn: 'root' //Lo hace disponible globalmente singleton
})
export class DatosService {

  private apiUrl = "http://localhost:8080/api/contactos/all";

  // 1. Inyecta el HttpClient (ya disponible gracias a provideHttpClient en app.config.ts)
  constructor(private http: HttpClient) { }

  // 2. Método para hacer una petición GET
  obtenerContactos(): Observable<ContactoResponse[]> {
    //Aqui es donde angular se conecta al backend
    return this.http.get<ContactoResponse[]>(this.apiUrl);
  }

  //Metodo para el post/crear contacto
  crearContacto(contacto: ContactoRequest): Observable<ContactoResponse>{
    const httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post<ContactoResponse>("http://localhost:8080/api/contactos/create",contacto,{headers : httpHeaders});
  }
}
