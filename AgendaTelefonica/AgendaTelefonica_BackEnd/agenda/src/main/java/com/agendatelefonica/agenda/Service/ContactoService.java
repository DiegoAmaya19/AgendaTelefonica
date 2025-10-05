package com.agendatelefonica.agenda.Service;

import java.util.List;

import com.agendatelefonica.agenda.Model.DTO.ContactoRequest;
import com.agendatelefonica.agenda.Model.DTO.ContactoResponse;

public interface ContactoService {
    
    List<ContactoResponse> getAllContactos();

    ContactoResponse getContactoById(Integer id);

    ContactoResponse createContacto(ContactoRequest contacto);

    ContactoResponse updateContacto(Integer id, ContactoRequest contacto);
 }
