package com.repoinc.escuela.modelo;

import java.util.Date;
import java.util.Objects;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "fichaEstudiantes")
public class FichaEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "padre")
    private String padre;

    @Column(name = "madre")
    private String madre;

    @Column(name = "fechaMatricula")
    private Date fechaMatricula;

    @ManyToOne
    @JoinColumn(name = "fk_cursos")
    @NonNull
    private Curso curso;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @NonNull
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(@NonNull Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FichaEstudiante)) return false;
        FichaEstudiante that = (FichaEstudiante) o;
        return getId().equals(that.getId()) && getNombre().equals(that.getNombre()) && getApellidos().equals(that.getApellidos()) && getDireccion().equals(that.getDireccion()) && getFechaNacimiento().equals(that.getFechaNacimiento()) && getSexo().equals(that.getSexo()) && getPadre().equals(that.getPadre()) && getMadre().equals(that.getMadre()) && getFechaMatricula().equals(that.getFechaMatricula()) && getCurso().equals(that.getCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellidos(), getDireccion(), getFechaNacimiento(), getSexo(), getPadre(), getMadre(), getFechaMatricula(), getCurso());
    }
}