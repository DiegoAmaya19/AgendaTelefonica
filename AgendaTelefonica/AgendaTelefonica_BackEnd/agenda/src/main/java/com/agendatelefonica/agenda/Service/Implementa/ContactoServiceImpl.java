package com.agendatelefonica.agenda.Service.Implementa;

import java.util.List;
import org.springframework.stereotype.Service;
import com.agendatelefonica.agenda.Mapper.ContactoMapper;
import com.agendatelefonica.agenda.Model.DTO.ContactoRequest;
import com.agendatelefonica.agenda.Model.DTO.ContactoResponse;
import com.agendatelefonica.agenda.Model.Entity.Contacto;
import com.agendatelefonica.agenda.Repository.ContactoRepository;
import com.agendatelefonica.agenda.Service.ContactoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContactoServiceImpl implements ContactoService {

    private final ContactoRepository contactoRepository;
    private final ContactoMapper contactoMapper;

    @Override
    public List<ContactoResponse> getAllContactos() {
        
        return contactoRepository.findAll()
                .stream()
                .map(contactoMapper::toEntityResponse)
                .toList();
    }

    @Override
    public ContactoResponse getContactoById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContactoById'");
    }

    @Override
    public ContactoResponse createContacto(ContactoRequest contacto) {

            Contacto entity = contactoMapper.toEntity(contacto);
            entity = contactoRepository.save(entity);
          
        return contactoMapper.toEntityResponse(entity);

    }

    @Override
    public ContactoResponse updateContacto(Integer id, ContactoRequest contacto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateContacto'");
    }
    
}
