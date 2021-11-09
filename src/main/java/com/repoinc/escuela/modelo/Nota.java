package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    @NonNull
    private  Ficha ficha;

    @Id
    @ManyToOne
    @JoinColumn(name = "idCurso")
    @NonNull
    private  Curso curso;

    @Id
    @ManyToOne
    @JoinColumn(name = "idMateria")
    @NonNull
    private  Materia materia;

    @Id
    @Column(name ="anio")
    private Long anio;

    @Column(name = "examen_1")
    private Float examen_1;

    @Column(name = "examen_2")
    private Float examen_2;

    @Column(name = "examen_3")
    private Float examen_3;

    @Column(name = "examen_4")
    private Float examen_4;

    @Column(name = "promedio")
    private Float promedio;

    @Column(name = "recuperacion_1")
    private Float recuperacion_1;

    @Column(name = "recuperacion_2")
    private Float recuperacion_2;

    @NonNull
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(@NonNull Ficha ficha) {
        this.ficha = ficha;
    }

    @NonNull
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(@NonNull Curso curso) {
        this.curso = curso;
    }

    @NonNull
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(@NonNull Materia materia) {
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
        if (!(o instanceof Nota)) return false;
        Nota nota = (Nota) o;
        return getFicha().equals(nota.getFicha()) && getCurso().equals(nota.getCurso()) && getMateria().equals(nota.getMateria()) && getAnio().equals(nota.getAnio()) && getExamen_1().equals(nota.getExamen_1()) && getExamen_2().equals(nota.getExamen_2()) && getExamen_3().equals(nota.getExamen_3()) && getExamen_4().equals(nota.getExamen_4()) && getPromedio().equals(nota.getPromedio()) && getRecuperacion_1().equals(nota.getRecuperacion_1()) && getRecuperacion_2().equals(nota.getRecuperacion_2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFicha(), getCurso(), getMateria(), getAnio(), getExamen_1(), getExamen_2(), getExamen_3(), getExamen_4(), getPromedio(), getRecuperacion_1(), getRecuperacion_2());
    }
}