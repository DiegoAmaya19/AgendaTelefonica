package com.agendatelefonica.agenda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agendatelefonica.agenda.Model.Entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto,Integer> {
    
    List<Contacto> findAllById(Integer id);
}
