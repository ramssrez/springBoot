package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "numero_control", nullable = false, unique = true, length = 10)
    private String numeroControl;

    @Column(name = "semestre", nullable = false)
    private Integer semestre;

    @ManyToOne
    private Carrera carrera;

    @OneToOne
    //@JoinColumn(name = "persona_id")
    private Persona persona;
}
