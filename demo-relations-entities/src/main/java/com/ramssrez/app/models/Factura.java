package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {
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

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
            name = "facturas_productos",
            joinColumns = @JoinColumn(name = "factura_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id")
    )
    private List<Producto> productos;
}
