package com.example.entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Incidente {
    private @Setter @Getter String Detalle, Estado;
    private @Setter @Getter Date FechaResolucion, FechaIngreso;

     public Incidente() {
         String Detalle= "";
         String Estado= "";
         Date FechaResolucion= 00/00/0000;
         Date FechaIngreso= 00/00/0000;
     }
}
