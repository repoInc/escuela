package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.Curso;
import com.repoinc.escuela.modelo.Maestro;

import java.util.Objects;

public class MateriaDto {

    private Long id;
    private String materia;
    private Curso curso;
    private Maestro maestro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MateriaDto)) return false;
        MateriaDto that = (MateriaDto) o;
        return getId().equals(that.getId()) && getMateria().equals(that.getMateria()) && getCurso().equals(that.getCurso()) && getMaestro().equals(that.getMaestro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMateria(), getCurso(), getMaestro());
    }
}