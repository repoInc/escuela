package com.repoinc.escuela.dto;

import java.util.Objects;

public class CursoDto {

    private Long id;
    private String curso;
    private String modalidad;
    private String seccion;
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
        if (!(o instanceof CursoDto)) return false;
        CursoDto cursoDto = (CursoDto) o;
        return getId().equals(cursoDto.getId()) && getCurso().equals(cursoDto.getCurso()) && getModalidad().equals(cursoDto.getModalidad()) && getSeccion().equals(cursoDto.getSeccion()) && getJornada().equals(cursoDto.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCurso(), getModalidad(), getSeccion(), getJornada());
    }
}