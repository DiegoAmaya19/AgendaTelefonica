package com.agendatelefonica.agenda.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agendatelefonica.agenda.Model.Entity.NumeroTel;

public interface NumeroRepository extends JpaRepository<NumeroTel, Integer>{
    
    Optional<NumeroTel> findByNumero(String numero);

}
