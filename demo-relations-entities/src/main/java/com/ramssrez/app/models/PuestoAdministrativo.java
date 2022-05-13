package com.ramssrez.app.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "puesto_administrativos")
public class PuestoAdministrativo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_puesto", nullable = false, unique = false, length = 10)
    private String codigoPuesto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre", unique = true, nullable = false, length = 25)
    private String nombre;
}
