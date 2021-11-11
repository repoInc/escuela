package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cobros")
public class Cobro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String idCobro;

    @Column(name = "fechaCobro")
    private Date fechaCobro;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Float total;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    @NonNull
    private  Ficha ficha;

    @ManyToOne
    @JoinColumn(name = "idConcepto")
    @NonNull
    private  ConceptoPago conceptoPago;

    @ManyToOne
    @JoinColumn(name = "idJornada")
    @NonNull
    private  Jornada jornada;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    @NonNull
    private  Empleado empleado;

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

    @NonNull
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(@NonNull Ficha ficha) {
        this.ficha = ficha;
    }

    @NonNull
    public ConceptoPago getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(@NonNull ConceptoPago conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    @NonNull
    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(@NonNull Jornada jornada) {
        this.jornada = jornada;
    }

    @NonNull
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(@NonNull Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cobro)) return false;
        Cobro cobro = (Cobro) o;
        return getIdCobro().equals(cobro.getIdCobro()) && getFechaCobro().equals(cobro.getFechaCobro()) && getPrecio().equals(cobro.getPrecio()) && getCantidad().equals(cobro.getCantidad()) && getTotal().equals(cobro.getTotal()) && getFicha().equals(cobro.getFicha()) && getConceptoPago().equals(cobro.getConceptoPago()) && getJornada().equals(cobro.getJornada()) && getEmpleado().equals(cobro.getEmpleado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCobro(), getFechaCobro(), getPrecio(), getCantidad(), getTotal(), getFicha(), getConceptoPago(), getJornada(), getEmpleado());
    }
}