package com.ramssrez.app.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "apellido_paterno", nullable = false,length = 20)
    private String apellidoPaterno;

    @Column(name = "curp",nullable = false,length = 20)
    private String curp;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "nombre", nullable = false,length = 20)
    private String nombre;
}
