package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.Empleado;
import com.repoinc.escuela.modelo.FichaEstudiante;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.Objects;

public class VentaDto {

    private String idVenta;
    private Empleado empleado;
    private FichaEstudiante fichaEstudiante;
    private Date fechaVenta;

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public FichaEstudiante getFichaEstudiante() {
        return fichaEstudiante;
    }

    public void setFichaEstudiante(FichaEstudiante fichaEstudiante) {
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
        if (!(o instanceof VentaDto)) return false;
        VentaDto ventaDto = (VentaDto) o;
        return getIdVenta().equals(ventaDto.getIdVenta()) && getEmpleado().equals(ventaDto.getEmpleado()) && getFichaEstudiante().equals(ventaDto.getFichaEstudiante()) && getFechaVenta().equals(ventaDto.getFechaVenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVenta(), getEmpleado(), getFichaEstudiante(), getFechaVenta());
    }
}