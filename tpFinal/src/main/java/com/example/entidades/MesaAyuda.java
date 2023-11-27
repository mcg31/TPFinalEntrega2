package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MesaAyuda")
public class MesaAyuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMesaAyuda")
    private int idMesaAyuda;

    @Column(name = "NumerodeReclamo")
    private String NumerodeReclamo;

    @OneToMany(mappedBy = "MesaAyuda", cascade = CascadeType.ALL)
    private List<Operador> Operador = new ArrayList<>();



    public MesaAyuda() {
        idMesaAyuda=0;
        NumerodeReclamo= "";

    }

}

