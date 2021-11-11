package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "conceptoPagos")
public class ConceptoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String idConcepto;

    @Column(name = "concepto")
    private String concepto;

    @Column(name = "precio")
    private Float precio;

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConceptoPago)) return false;
        ConceptoPago that = (ConceptoPago) o;
        return getIdConcepto().equals(that.getIdConcepto()) && getConcepto().equals(that.getConcepto()) && getPrecio().equals(that.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdConcepto(), getConcepto(), getPrecio());
    }
}