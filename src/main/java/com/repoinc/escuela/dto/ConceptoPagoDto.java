package com.repoinc.escuela.dto;

import java.util.Objects;

public class ConceptoPagoDto {

    private String idConcepto;
    private String concepto;
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
        if (!(o instanceof ConceptoPagoDto)) return false;
        ConceptoPagoDto that = (ConceptoPagoDto) o;
        return Objects.equals(getIdConcepto(), that.getIdConcepto()) && Objects.equals(getConcepto(), that.getConcepto()) && Objects.equals(getPrecio(), that.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdConcepto(), getConcepto(), getPrecio());
    }
}