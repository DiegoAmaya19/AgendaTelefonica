package com.agendatelefonica.agenda.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agendatelefonica.agenda.Model.Entity.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,Integer>{
    
    Optional<Direccion> findByDireccion(String direccion);
}
