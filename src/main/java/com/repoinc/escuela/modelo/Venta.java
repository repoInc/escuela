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
    private FichaEstudiante fichaEstudiante;

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
    public FichaEstudiante getFichaEstudiante() {
        return fichaEstudiante;
    }

    public void setFichaEstudiante(@NonNull FichaEstudiante fichaEstudiante) {
        this.fichaEstudiante = fichaEstudiante;
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
        return getIdVenta().equals(venta.getIdVenta()) && getEmpleado().equals(venta.getEmpleado()) && getFichaEstudiante().equals(venta.getFichaEstudiante()) && getFechaVenta().equals(venta.getFechaVenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVenta(), getEmpleado(), getFichaEstudiante(), getFechaVenta());
    }
}