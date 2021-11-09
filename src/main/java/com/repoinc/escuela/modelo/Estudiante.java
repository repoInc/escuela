package com.repoinc.escuela.modelo;

import java.util.Date;
import java.util.Objects;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue
    private Long idEstudiante;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
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
    private  Date fechaMatricula;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return getIdEstudiante().equals(that.getIdEstudiante()) && getNombre().equals(that.getNombre()) && getApellidos().equals(that.getApellidos()) && getDireccion().equals(that.getDireccion()) && getFechaNacimiento().equals(that.getFechaNacimiento()) && getSexo().equals(that.getSexo()) && getPadre().equals(that.getPadre()) && getMadre().equals(that.getMadre()) && getFechaMatricula().equals(that.getFechaMatricula()) && getCurso().equals(that.getCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEstudiante(), getNombre(), getApellidos(), getDireccion(), getFechaNacimiento(), getSexo(), getPadre(), getMadre(), getFechaMatricula(), getCurso());
    }
}