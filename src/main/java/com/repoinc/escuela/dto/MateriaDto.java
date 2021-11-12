package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.Curso;
import com.repoinc.escuela.modelo.Maestro;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class MateriaDto {

    private String idMateria;
    private String materia;
    private Curso curso;
    private Maestro maestro;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
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
        return Objects.equals(getIdMateria(), that.getIdMateria()) && Objects.equals(getMateria(), that.getMateria()) && Objects.equals(getCurso(), that.getCurso()) && Objects.equals(getMaestro(), that.getMaestro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdMateria(), getMateria(), getCurso(), getMaestro());
    }
}