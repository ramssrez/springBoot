package com.ramssrez.app.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera un identificador al registro de la base de datos
    @Column(name = "id")
    private Long id;

    @Column(name = "email", unique = true, length = 13, nullable = false)
    private String email;

    @Column(name = "rfc", unique = true, length = 25,nullable = false)
    private String rfc;

    @Column(name = "nombre", length = 15)
    private String nombre;

    @Column(name = "apellido", length = 15)
    private String apellido;

    //mappedBy hace referencia a la clave de la otra tabla, para este caso es el cliente de la dirección
    @OneToMany(mappedBy = "cliente") //Relación uno a muchos, pero mapeado a cliente en direccion
    private List<Direccion> direcciones;
}
