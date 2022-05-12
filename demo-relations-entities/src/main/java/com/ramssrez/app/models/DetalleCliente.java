package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "detalle_clientes")
public class DetalleCliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "sexo",length = 1)
    private int sexo;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @OneToOne //Relación uno a uno
    @JoinColumns({
            @JoinColumn(name = "cliente_email",referencedColumnName = "email"),
            @JoinColumn(name = "cliente_rfc",referencedColumnName = "rfc")
    })
    //@JoinColumn(name = "clientes_idx") //Nombre de la llave foranea
    private Cliente cliente;
}
