package com.agendatelefonica.agenda.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.agendatelefonica.agenda.Model.Entity.Contacto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class CustomRepository {
    
    private final EntityManager entityManager;

    public List<Contacto> findAllByNameContacto(String nombre){

        //Contructor de consultas
        var criteriaBuilder = entityManager.getCriteriaBuilder();

        //Consulta creada
        var criteriaQuery = criteriaBuilder.createQuery(Contacto.class);

        //Raiz del entity
        var root = criteriaQuery.from(Contacto.class);

        //Condiciones
        var predications = new ArrayList<Predicate>();

        if(nombre != null){
            predications.add(criteriaBuilder.like(root.get("primerNombre"), "%"+nombre+"%"));
        }

        criteriaQuery.where(criteriaBuilder.and(predications.toArray(new Predicate[0])));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
