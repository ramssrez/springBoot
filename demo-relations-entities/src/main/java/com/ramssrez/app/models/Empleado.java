package com.ramssrez.app.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
    @EmbeddedId
    private EmpleadoPK empleadoPK;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;
}
