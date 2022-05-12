package com.ramssrez.app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @EmbeddedId
    private ClientePK clientePK;

    @Column(name = "nombre", length = 15)
    private String nombre;

    @Column(name = "apellido", length = 15)
    private String apellido;

    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "cliente_email", referencedColumnName = "email"),
            @JoinColumn(name = "cliente_rfc", referencedColumnName = "rfc")
    })
    private List<Direccion> direcciones;
}
