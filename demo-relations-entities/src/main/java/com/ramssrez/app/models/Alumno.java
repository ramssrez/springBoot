package com.ramssrez.app.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "numero_control", nullable = false)
    private String numeroControl;

    @Column(name = "semestre", nullable = false)
    private Integer semestre;
}
