package com.agendatelefonica.agenda.Model.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contacto")
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pare el auto incremento
    @Column(name = "id_contacto")
    private Integer id;

    @Column(name = "primer_nombre", nullable = false, length = 50)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 50)
    private String segundoNombre;

    @Column(name = "primer_apellido", nullable = false, length = 50)
    private String primerApellido;

    @Column(name = "segundo_apellido", nullable = false, length = 50)
    private String segundoApellido;

    @Column(name = "grupo", length = 50)
    private String grupo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion" ,nullable = false)
    private Direccion direccion; //Debe ser de tipo object por que tiene una relacion con otra tabla

    @Column(name = "correo", length = 100, nullable = false)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_numero", referencedColumnName = "id_numero", nullable = false)
    private NumeroTel numero; //Debe ser de tipo object por que tiene una relacion con otra tabla
}
