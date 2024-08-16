package com.jcell.sistemajcell.InfoModel;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class InfoModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String Name;
    String Apellido;
    String Correo;

}
