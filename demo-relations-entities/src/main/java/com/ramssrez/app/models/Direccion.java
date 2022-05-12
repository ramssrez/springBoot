package com.ramssrez.app.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Deprecated
@Entity
@Table(name = "direcciones")
public class Direccion {
    private Long id;
    private String calle;
    private String numero;
}
