package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio")
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private @Setter @Getter int idServicio;
    @Column(name = "TipodeServicio")
    private @Setter @Getter String TipodeServicio;
    @Column(name = "Empresa")
    private @Setter @Getter String Empresa;




    @OneToMany(mappedBy = "Servicio", cascade = CascadeType.ALL)
    private List<Incidente> Incidente = new ArrayList<>();
    public Servicio() {
        String TipodeServicio= "";
        String Empresa= "";

    }
}
