package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {
    @EmbeddedId
    private FacturaPK facturaPK;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "total")
    private BigDecimal total;

    @ManyToOne
    //@JoinColumn(name = "cliente_id")
    @JoinColumns({
            @JoinColumn(name = "cliente_email",referencedColumnName = "email"),
            @JoinColumn(name = "cliente_rfc",referencedColumnName = "rfc")
    })
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
            name = "facturas_productos",
            joinColumns = {
                    @JoinColumn(name = "factura_folio", referencedColumnName = "folio"),
                    @JoinColumn(name = "factura_fecha_emision", referencedColumnName = "fecha_emision")
            },
            inverseJoinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id")
    )
    private List<Producto> productos;
}
