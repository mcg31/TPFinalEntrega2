package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTecnico")
    @ManyToOne
    @JoinColumn(name = "idTecnico")
    private @Setter @Getter int idTecnico;
    @Column(name = "EstadoTecnico")
    private @Setter @Getter String EstadoTecnico;
    @Column(name = "IncidenteResueltos")
    private @Setter @Getter String IncidenteResueltos;
    @Column(name = "Nombre")
    private @Setter @Getter String Nombre;
    @Column(name = "Apellido")
    private @Setter @Getter String Apellido;
    @Column(name = "Cuil")
    private @Setter @Getter String Cuil;


    @OneToMany(mappedBy = "Tecnico", cascade = CascadeType.ALL)
    private List<Incidente> Incidente = new ArrayList<>();
     public Tecnico() {
         String EstadoTecnico= "";
         String IncidenteResueltos= "";
         String Nombre= "";
         String Apellido= "";
         String Cuil= "";
     }
}
