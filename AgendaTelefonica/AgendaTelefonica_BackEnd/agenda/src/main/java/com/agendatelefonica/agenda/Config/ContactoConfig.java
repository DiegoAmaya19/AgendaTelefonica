package com.agendatelefonica.agenda.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.agendatelefonica.agenda.Mapper.ContactoMapper;
import com.agendatelefonica.agenda.Repository.DireccionRepository;
import com.agendatelefonica.agenda.Repository.NumeroRepository;

@Configuration
public class ContactoConfig {
    
    @Bean
    public ContactoMapper contactoMapper(DireccionRepository direccionRepository, NumeroRepository numeroRepository){

        return new ContactoMapper(direccionRepository, numeroRepository);
    }
}
