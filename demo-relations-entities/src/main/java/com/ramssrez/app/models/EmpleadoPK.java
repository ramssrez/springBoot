package com.ramssrez.app.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class EmpleadoPK implements Serializable {

    @Column(name = "codigo_empleado", unique = true, nullable = false, length = 10)
    private String codigoEmpleado;

    @Column(name = "nss", unique = true, nullable = false, length = 11)
    private String numeroSocial;

    @Column(name = "rfc", unique = true, nullable = false, length = 13)
    private String rfc;

}
