package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "personas")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido_materno", length = 20)
    private String apellidoMaterno;

    @Column(name = "apellido_paterno", nullable = false,length = 20)
    private String apellidoPaterno;

    @Column(name = "curp",nullable = false,length = 18, unique = true)
    private String curp;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "nombre", nullable = false,length = 20)
    private String nombre;
}
