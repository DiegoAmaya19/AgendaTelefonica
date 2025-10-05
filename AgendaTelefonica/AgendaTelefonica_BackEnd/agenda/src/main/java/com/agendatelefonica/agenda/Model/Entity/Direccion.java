package com.agendatelefonica.agenda.Model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "direccion")
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pare el auto incremento
    @Column(name = "id_direccion")
    private Integer id;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

}
