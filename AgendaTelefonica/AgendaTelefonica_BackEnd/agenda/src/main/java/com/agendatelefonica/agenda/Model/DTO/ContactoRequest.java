package com.agendatelefonica.agenda.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ContactoRequest {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String grupo;
    private String direccion;
    private String email;
    private String indicativo;
    private String numero;
}
