package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table( name = "Operador")
public class Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOperador")
    @ManyToOne
    @JoinColumn(name = "idOperador")
    private @Setter int idOperador;

    @Column(name = "Nombre")
    private @Setter @Getter String Nombre;

    @Column(name = "Apellido")
    private @Setter @Getter String Apellido;

    @OneToMany(mappedBy = "Operador", cascade = CascadeType.ALL)
    private List<Cliente> Cliente = new ArrayList<>();

         public Operador() {
         idOperador= 0;
         String Nombre= "";
         String Apellido= "";

     }
}
