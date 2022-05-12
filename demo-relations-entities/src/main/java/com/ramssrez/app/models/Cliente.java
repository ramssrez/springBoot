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

    //mappedBy hace referencia a la clave de la otra tabla, para este caso es el cliente de la dirección
    @OneToMany(mappedBy = "cliente") //Relación uno a muchos, pero mapeado a cliente en direccion
    private List<Direccion> direcciones;
}
