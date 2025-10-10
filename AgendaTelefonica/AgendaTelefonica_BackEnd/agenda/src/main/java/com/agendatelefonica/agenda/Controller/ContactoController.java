package com.agendatelefonica.agenda.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agendatelefonica.agenda.Model.DTO.ContactoRequest;
import com.agendatelefonica.agenda.Model.DTO.ContactoResponse;
import com.agendatelefonica.agenda.Service.ContactoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/contactos")
public class ContactoController {

    private final ContactoService contactoService;

    @GetMapping("/all")
    public List<ContactoResponse> getAllContactos(){

        return contactoService.getAllContactos();
    }

    @PostMapping("create")
    public ContactoResponse createContacto(@RequestBody ContactoRequest contacto){

        return contactoService.createContacto(contacto);

    }
    
}
