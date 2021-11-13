package com.repoinc.escuela.dto;

import java.util.Objects;

public class ConceptoPagoDto {

    private Long id;
    private String concepto;
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
        if (!(o instanceof ConceptoPagoDto)) return false;
        ConceptoPagoDto dto = (ConceptoPagoDto) o;
        return getId().equals(dto.getId()) && getConcepto().equals(dto.getConcepto()) && getPrecio().equals(dto.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getConcepto(), getPrecio());
    }
}