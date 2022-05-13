package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cedula_profesional", unique = true)
    private String cedulaProfesional;

    @ManyToOne
    private Empleado empleado;

    @OneToOne
    private Cubiculo cubiculo;
}
