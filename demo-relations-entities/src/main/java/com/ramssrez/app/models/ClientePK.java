package com.ramssrez.app.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ClientePK implements Serializable {

    @Column(name = "email", unique = true, length = 13, nullable = false)
    private String email;

    @Column(name = "rfc", unique = true, length = 25,nullable = false)
    private String rfc;
}
