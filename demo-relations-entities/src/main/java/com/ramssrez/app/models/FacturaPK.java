package com.ramssrez.app.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class FacturaPK implements Serializable {
    @Column(name = "fecha_emision")
    private LocalDate fechaEmisión;

    @Column(name = "folio")
    private String folio;
}
