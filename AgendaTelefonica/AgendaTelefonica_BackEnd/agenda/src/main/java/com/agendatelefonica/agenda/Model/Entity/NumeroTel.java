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
@Table(name = "numerotel")
public class NumeroTel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pare el auto incremento
    @Column(name = "id_numero")
    private Integer id;

    @Column(name = "indicativo", nullable = false, length = 10)
    private String indicativo;

    @Column(name = "numero", nullable = false, length = 30)
    private String numero;

    public NumeroTel(){};

    public NumeroTel(String indicativo, String numero) {
        this.indicativo = indicativo;
        this.numero = numero;
    }

}
