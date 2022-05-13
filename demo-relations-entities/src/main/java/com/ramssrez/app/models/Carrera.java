package com.ramssrez.app.models;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_carrera", nullable = false, unique = true, length = 5)
    private String codigoCarrera;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

}
