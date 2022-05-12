package com.ramssrez.app.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmisión;

    @Column(name = "folio")
    private String folio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "total")
    private BigDecimal total;

    @ManyToMany
    private List<Producto> productos;
}
