package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cubiculos")
public class Cubiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_cubiculo", unique = true)
    private String codigoCubiculo;
}
