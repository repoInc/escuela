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
    private Long id;

    @Column(name = "fechaVenta")
    private Date fechaVenta;

    @ManyToOne
    @JoinColumn(name = "fk_empleados")
    @NonNull
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "fk_fichaEstudiantes")
    @NonNull
    private FichaEstudiante fichaEstudiante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return getId().equals(venta.getId()) && getFechaVenta().equals(venta.getFechaVenta()) && getEmpleado().equals(venta.getEmpleado()) && getFichaEstudiante().equals(venta.getFichaEstudiante());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFechaVenta(), getEmpleado(), getFichaEstudiante());
    }
}