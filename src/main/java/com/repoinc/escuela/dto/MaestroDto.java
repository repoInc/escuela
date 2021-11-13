package com.repoinc.escuela.dto;


import java.util.Objects;

public class MaestroDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaestroDto)) return false;
        MaestroDto that = (MaestroDto) o;
        return getId().equals(that.getId()) && getNombre().equals(that.getNombre()) && getApellido().equals(that.getApellido()) && getDireccion().equals(that.getDireccion()) && getTelefono().equals(that.getTelefono()) && getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido(), getDireccion(), getTelefono(), getEmail());
    }
}