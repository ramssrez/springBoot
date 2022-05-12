package com.ramssrez.app.models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
