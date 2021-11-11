package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String idEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "mail")
    private String email;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        if (!(o instanceof Maestro)) return false;
        Maestro maestro = (Maestro) o;
        return getIdEmpleado().equals(maestro.getIdMaestro()) && getNombre().equals(maestro.getNombre()) && getApellido().equals(maestro.getApellido()) && getDireccion().equals(maestro.getDireccion()) && getTelefono().equals(maestro.getTelefono()) && getEmail().equals(maestro.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEmpleado(), getNombre(), getApellido(), getDireccion(), getTelefono(), getEmail());
    }
}