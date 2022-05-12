package com.ramssrez.app.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "detalle_clientes")
public class DetalleCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "sexo",length = 1)
    private int sexo;

    @Column(name = "telefono", length = 10)
    private String telefono;
}
