package com.ramssrez.app.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_materia", unique = true, nullable = false, length = 10)
    private String codigoMateria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "materias_carreras",
            joinColumns =@JoinColumn(name = "materia_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    )
    private List<Carrera> carreras;
}
