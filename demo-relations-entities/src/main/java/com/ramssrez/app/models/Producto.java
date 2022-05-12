package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private BigDecimal precio;

    @ManyToMany
    @JoinTable(
            name = "facturas_productos",
            joinColumns =@JoinColumn(name = "producto_id", referencedColumnName = "id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "factura_folio", referencedColumnName = "folio"),
                    @JoinColumn(name = "factura_fecha_emision", referencedColumnName = "fecha_emision")
            }
    )
    private List<Factura> facturas;
}
