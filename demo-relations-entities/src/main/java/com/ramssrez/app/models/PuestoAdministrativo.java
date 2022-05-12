package com.ramssrez.app.models;


import javax.persistence.*;

@Entity
@Table(name = "puesto_administrativos")
public class PuestoAdministrativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_puesto")
    private String codigoPuesto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre")
    private String nombre;
}
