package com.agendatelefonica.agenda.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ContactoResponse {
    
    private String nombre;
    private String apellido;
    private String grupo;
    private String direccion;
    private String email;
    private String numero;

}
