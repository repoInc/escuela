package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.ConceptoPago;
import com.repoinc.escuela.modelo.Empleado;
import com.repoinc.escuela.modelo.FichaEstudiante;
import com.repoinc.escuela.modelo.Jornada;

import java.util.Date;
import java.util.Objects;

public class CobroDto {

    private String idCobro;
    private Date fechaCobro;
    private Float precio;
    private Integer cantidad;
    private Float total;
    private FichaEstudiante fichaEstudiante;
    private ConceptoPago conceptoPago;
    private Jornada jornada;
    private Empleado empleado;

    public String getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(String idCobro) {
        this.idCobro = idCobro;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public FichaEstudiante getFichaEstudiante() {
        return fichaEstudiante;
    }

    public void setFichaEstudiante(FichaEstudiante fichaEstudiante) {
        this.fichaEstudiante = fichaEstudiante;
    }

    public ConceptoPago getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(ConceptoPago conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CobroDto)) return false;
        CobroDto cobroDto = (CobroDto) o;
        return getIdCobro().equals(cobroDto.getIdCobro()) && getFechaCobro().equals(cobroDto.getFechaCobro()) && getPrecio().equals(cobroDto.getPrecio()) && getCantidad().equals(cobroDto.getCantidad()) && getTotal().equals(cobroDto.getTotal()) && getFichaEstudiante().equals(cobroDto.getFichaEstudiante()) && getConceptoPago().equals(cobroDto.getConceptoPago()) && getJornada().equals(cobroDto.getJornada()) && getEmpleado().equals(cobroDto.getEmpleado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCobro(), getFechaCobro(), getPrecio(), getCantidad(), getTotal(), getFichaEstudiante(), getConceptoPago(), getJornada(), getEmpleado());
    }
}