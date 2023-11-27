package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "TipoIncidente")
public class TipoIncidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoIncidente")
    @ManyToOne
    @JoinColumn(name = "idTipoIncidente")
    private @Setter @Getter int idTipoIncidente;
    @Column(name = "TipodeIncidente")
    private @Setter @Getter String TipodeIncidente;


    @OneToMany(mappedBy = "TipoIncidente", cascade = CascadeType.ALL)
    private List<Tecnico> Tecnico = new ArrayList<>();
    @OneToMany(mappedBy = "TipoIncidente", cascade = CascadeType.ALL)
    private List<Incidente> Incidente = new ArrayList<>();
     public TipoIncidente() {
         int idTipoIncidente= 0;
         String TipodeIncidente= "";

     }
}
