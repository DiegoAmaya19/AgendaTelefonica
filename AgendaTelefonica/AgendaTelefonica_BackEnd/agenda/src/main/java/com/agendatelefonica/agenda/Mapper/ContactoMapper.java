package com.agendatelefonica.agenda.Mapper;

import com.agendatelefonica.agenda.Model.DTO.ContactoResponse;
import com.agendatelefonica.agenda.Model.Entity.Contacto;

public class ContactoMapper {

    public ContactoResponse toEntity(Contacto contacto) {
        return new ContactoResponse(
            contacto.getPrimerNombre() + " " + (contacto.getSegundoNombre() == null ? "" : contacto.getSegundoNombre()),
            contacto.getPrimerApellido() + " " + (contacto.getSegundoApellido() == null ? "" : contacto.getSegundoApellido()),
            contacto.getGrupo() == null ? "" : contacto.getGrupo(),
            contacto.getDireccion().getDireccion(),
            contacto.getEmail(),
            contacto.getNumero().getNumero()       
        );
    }
    
}
