package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "mail")
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
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return getId().equals(empleado.getId()) && getNombre().equals(empleado.getNombre()) && getApellido().equals(empleado.getApellido()) && getDireccion().equals(empleado.getDireccion()) && getTelefono().equals(empleado.getTelefono()) && getEmail().equals(empleado.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido(), getDireccion(), getTelefono(), getEmail());
    }
}