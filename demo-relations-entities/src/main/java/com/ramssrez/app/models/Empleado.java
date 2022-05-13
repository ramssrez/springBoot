package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
    @EmbeddedId
    private EmpleadoPK empleadoPK;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;

    @OneToOne
    private Persona persona;
}
