package com.repoinc.escuela.dto;
import java.util.Objects;

public class ProveedorDto {

    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProveedorDto)) return false;
        ProveedorDto that = (ProveedorDto) o;
        return getId().equals(that.getId()) && getNombre().equals(that.getNombre()) && getDireccion().equals(that.getDireccion()) && getTelefono().equals(that.getTelefono());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getDireccion(), getTelefono());
    }
}