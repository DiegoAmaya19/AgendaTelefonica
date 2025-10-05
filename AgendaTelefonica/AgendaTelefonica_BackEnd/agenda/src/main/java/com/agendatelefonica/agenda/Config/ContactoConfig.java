package com.agendatelefonica.agenda.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.agendatelefonica.agenda.Mapper.ContactoMapper;

@Configuration
public class ContactoConfig {
    
    @Bean
    public ContactoMapper contactoMapper(){
        return new ContactoMapper();
    }
}
