package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empleado == null) ? 0 : empleado.hashCode());
        result = prime * result + ((fechaVenta == null) ? 0 : fechaVenta.hashCode());
        result = prime * result + ((fichaEstudiante == null) ? 0 : fichaEstudiante.hashCode());
        result = prime * result + ((idVenta == null) ? 0 : idVenta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Venta other = (Venta) obj;
        if (empleado == null) {
            if (other.empleado != null)
                return false;
        } else if (!empleado.equals(other.empleado))
            return false;
        if (fechaVenta == null) {
            if (other.fechaVenta != null)
                return false;
        } else if (!fechaVenta.equals(other.fechaVenta))
            return false;
        if (fichaEstudiante == null) {
            if (other.fichaEstudiante != null)
                return false;
        } else if (!fichaEstudiante.equals(other.fichaEstudiante))
            return false;
        if (idVenta == null) {
            if (other.idVenta != null)
                return false;
        } else if (!idVenta.equals(other.idVenta))
            return false;
        return true;
    }


  
}