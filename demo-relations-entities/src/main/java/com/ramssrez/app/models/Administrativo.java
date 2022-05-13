package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "administrativos")
public class Administrativo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private PuestoAdministrativo puestoAdministrativo;

    @ManyToOne
    private Empleado empleado;
}
