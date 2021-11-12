package com.repoinc.escuela.dto;

import javax.persistence.Column;
import java.util.Objects;

public class MaestroDto {

    private String idMaestro;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
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
        return Objects.equals(getIdMaestro(), that.getIdMaestro()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellido(), that.getApellido()) && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(getTelefono(), that.getTelefono()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdMaestro(), getNombre(), getApellido(), getDireccion(), getTelefono(), getEmail());
    }
}