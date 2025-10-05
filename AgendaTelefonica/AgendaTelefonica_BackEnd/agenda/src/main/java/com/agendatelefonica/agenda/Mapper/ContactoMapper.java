package com.agendatelefonica.agenda.Mapper;

import com.agendatelefonica.agenda.Model.DTO.ContactoRequest;
import com.agendatelefonica.agenda.Model.DTO.ContactoResponse;
import com.agendatelefonica.agenda.Model.Entity.Contacto;
import com.agendatelefonica.agenda.Model.Entity.Direccion;
import com.agendatelefonica.agenda.Model.Entity.NumeroTel;
import com.agendatelefonica.agenda.Repository.DireccionRepository;
import com.agendatelefonica.agenda.Repository.NumeroRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContactoMapper {

    private final DireccionRepository direccionRepository;
    private final NumeroRepository numeroRepository;

    public ContactoResponse toEntityResponse(Contacto contacto) {
        return new ContactoResponse(
                contacto.getPrimerNombre() + " "
                        + (contacto.getSegundoNombre() == null ? "" : contacto.getSegundoNombre()),
                contacto.getPrimerApellido() + " "
                        + (contacto.getSegundoApellido() == null ? "" : contacto.getSegundoApellido()),
                contacto.getGrupo() == null ? "" : contacto.getGrupo(),
                contacto.getDireccion().getDireccion(),
                contacto.getEmail(),
                contacto.getNumero().getNumero());
    }

    public Contacto toEntity(ContactoRequest contacto) {

        var direccion = direccionRepository.findByDireccion(contacto.getDireccion());
        var numero = numeroRepository.findByNumero(contacto.getNumero());

        Contacto entity = new Contacto();

        entity.setPrimerNombre(contacto.getPrimerNombre());
        entity.setSegundoNombre(contacto.getSegundoNombre() == null ? "" : contacto.getSegundoNombre());
        entity.setPrimerApellido(contacto.getPrimerApellido());
        entity.setSegundoApellido(contacto.getSegundoApellido());
        entity.setGrupo(contacto.getGrupo() == null ? "" : contacto.getGrupo());
        entity.setDireccion(direccion.orElseGet(() -> {
            Direccion newDireccion = new Direccion();
            newDireccion.setDireccion(contacto.getDireccion());
            return direccionRepository.save(newDireccion);
        }));
        entity.setEmail(contacto.getEmail());
        entity.setNumero(
            numero.orElseGet(() ->{
                NumeroTel newNumero = new NumeroTel(contacto.getIndicativo(),contacto.getNumero());
                return numeroRepository.save(newNumero);
            })
        );

        return entity;
    }

}
