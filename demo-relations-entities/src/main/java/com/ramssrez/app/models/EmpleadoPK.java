package com.ramssrez.app.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class EmpleadoPK implements Serializable {

    @Column(name = "codigo_empleado", nullable = false, length = 10)
    private String codigoEmpleado;

    @Column(name = "nss", nullable = false, length = 11)
    private String numeroSocial;

    @Column(name = "rfc", nullable = false, length = 13)
    private String rfc;

}
