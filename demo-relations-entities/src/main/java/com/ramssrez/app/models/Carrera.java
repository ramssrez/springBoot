package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_carrera", nullable = false, unique = true, length = 5)
    private String codigoCarrera;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "materias_carreras",
            joinColumns = @JoinColumn(name = "carrera_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id")
    )
    private List<Materia> materias;
}
