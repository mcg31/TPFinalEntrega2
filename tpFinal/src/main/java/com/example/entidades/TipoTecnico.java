package com.example.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "TipoTecnico")
public class TipoTecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoTecnico")
    @ManyToOne
    @JoinColumn(name = "idTipoTecnico")
    private @Setter @Getter int idTipoTecnico;

    @Column(name = "TipodeExpecialidad")
    private @Setter @Getter String TipodeExpecialidad;

    @OneToMany(mappedBy = "TipoTecnico", cascade = CascadeType.ALL)
    private List<Tecnico> Tecnico = new ArrayList<>();

     public TipoTecnico(){
         int idTipoTecnico;
         String TipodeExpecialidad= "";
     }


}
