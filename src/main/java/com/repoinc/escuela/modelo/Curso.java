package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "curso")
    private String curso;

    @Column(name = "modalidad")
    private String modalidad;

    @Column(name = "seccion")
    private String seccion;

    @Column(name = "jornada")
    private String jornada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso1 = (Curso) o;
        return getId().equals(curso1.getId()) && getCurso().equals(curso1.getCurso()) && getModalidad().equals(curso1.getModalidad()) && getSeccion().equals(curso1.getSeccion()) && getJornada().equals(curso1.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCurso(), getModalidad(), getSeccion(), getJornada());
    }
}