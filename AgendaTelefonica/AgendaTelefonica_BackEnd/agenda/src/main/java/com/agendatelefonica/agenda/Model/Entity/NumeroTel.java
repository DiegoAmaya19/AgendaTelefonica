package com.agendatelefonica.agenda.Model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class NumeroTel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pare el auto incremento
    @Column(name = "id_numero")
    private Integer id;

    @Column(name = "indicativo", nullable = false, length = 10)
    private String indicativo;

    @Column(name = "numero", nullable = false, length = 30)
    private String numero;

}
