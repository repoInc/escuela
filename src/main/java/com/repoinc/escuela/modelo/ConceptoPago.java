package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "conceptoPagos")
public class ConceptoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "concepto")
    private String concepto;

    @Column(name = "precio")
    private Float precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return getId().equals(that.getId()) && getConcepto().equals(that.getConcepto()) && getPrecio().equals(that.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getConcepto(), getPrecio());
    }
}