package com.repoinc.escuela.dto;

import java.util.Objects;

public class CursoDto {

    private String idCurso;
    private String curso;
    private String modalidad;
    private String seccion;
    private String jornada;

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
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
        return Objects.equals(getIdCurso(), cursoDto.getIdCurso()) && Objects.equals(getCurso(), cursoDto.getCurso()) && Objects.equals(getModalidad(), cursoDto.getModalidad()) && Objects.equals(getSeccion(), cursoDto.getSeccion()) && Objects.equals(getJornada(), cursoDto.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCurso(), getCurso(), getModalidad(), getSeccion(), getJornada());
    }
}