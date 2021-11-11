package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String idVenta;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    @NonNull
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    @NonNull
    private Ficha ficha;

    @Column(name = "fechaVenta")
    private Date fechaVenta;

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    @NonNull
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(@NonNull Empleado empleado) {
        this.empleado = empleado;
    }

    @NonNull
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(@NonNull Ficha ficha) {
        this.ficha = ficha;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return getIdVenta().equals(venta.getIdVenta()) && getEmpleado().equals(venta.getEmpleado()) && getFicha().equals(venta.getFicha()) && getFechaVenta().equals(venta.getFechaVenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVenta(), getEmpleado(), getFicha(), getFechaVenta());
    }
}