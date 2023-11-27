package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private @Setter @Getter int idCliente;

    @Column(name = "Nombre")
    private String @Setter@Getter Nombre;
    @Column(name = "Apellido")
    private String @Setter @Getter Apellido;
    @Column(name = "RazonSocial")
    private String @Setter @Getter RazonSocial;
    @Column(name = "Cuil")
    private @Setter @Getter String Cuil;




    @OneToMany(mappedBy = "Cliente", cascade = CascadeType.ALL)
    private List<Servicio> Servicio = new ArrayList<>();
    public Cliente() {
        String Nombre= "";
        String Apellido= "";
        String RazonSocial= "";
        String Cuil= "";
        int idCliente= 0;

    }

}
