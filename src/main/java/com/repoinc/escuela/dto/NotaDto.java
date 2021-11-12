package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.Curso;
import com.repoinc.escuela.modelo.FichaEstudiante;
import com.repoinc.escuela.modelo.Materia;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class NotaDto {

    private FichaEstudiante fichaEstudiante;
    private Curso curso;
    private Materia materia;
    private Long anio;
    private Float examen_1;
    private Float examen_2;
    private Float examen_3;
    private Float examen_4;
    private Float promedio;
    private Float recuperacion_1;
    private Float recuperacion_2;

    public FichaEstudiante getFichaEstudiante() {
        return fichaEstudiante;
    }

    public void setFichaEstudiante(FichaEstudiante fichaEstudiante) {
        this.fichaEstudiante = fichaEstudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    public Float getExamen_1() {
        return examen_1;
    }

    public void setExamen_1(Float examen_1) {
        this.examen_1 = examen_1;
    }

    public Float getExamen_2() {
        return examen_2;
    }

    public void setExamen_2(Float examen_2) {
        this.examen_2 = examen_2;
    }

    public Float getExamen_3() {
        return examen_3;
    }

    public void setExamen_3(Float examen_3) {
        this.examen_3 = examen_3;
    }

    public Float getExamen_4() {
        return examen_4;
    }

    public void setExamen_4(Float examen_4) {
        this.examen_4 = examen_4;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public Float getRecuperacion_1() {
        return recuperacion_1;
    }

    public void setRecuperacion_1(Float recuperacion_1) {
        this.recuperacion_1 = recuperacion_1;
    }

    public Float getRecuperacion_2() {
        return recuperacion_2;
    }

    public void setRecuperacion_2(Float recuperacion_2) {
        this.recuperacion_2 = recuperacion_2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotaDto)) return false;
        NotaDto notaDto = (NotaDto) o;
        return Objects.equals(getFichaEstudiante(), notaDto.getFichaEstudiante()) && Objects.equals(getCurso(), notaDto.getCurso()) && Objects.equals(getMateria(), notaDto.getMateria()) && Objects.equals(getAnio(), notaDto.getAnio()) && Objects.equals(getExamen_1(), notaDto.getExamen_1()) && Objects.equals(getExamen_2(), notaDto.getExamen_2()) && Objects.equals(getExamen_3(), notaDto.getExamen_3()) && Objects.equals(getExamen_4(), notaDto.getExamen_4()) && Objects.equals(getPromedio(), notaDto.getPromedio()) && Objects.equals(getRecuperacion_1(), notaDto.getRecuperacion_1()) && Objects.equals(getRecuperacion_2(), notaDto.getRecuperacion_2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFichaEstudiante(), getCurso(), getMateria(), getAnio(), getExamen_1(), getExamen_2(), getExamen_3(), getExamen_4(), getPromedio(), getRecuperacion_1(), getRecuperacion_2());
    }
}