package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "notas")
public class Nota implements Serializable {

    @Id
    @Column(name ="anio")
    private Long anio;

    @Id
    @ManyToOne
    @JoinColumn(name = "fk_estudiantes")
    @NonNull
    private FichaEstudiante fichaEstudiante;

    @Id
    @ManyToOne
    @JoinColumn(name = "fk_cursos")
    @NonNull
    private  Curso curso;

    @Id
    @ManyToOne
    @JoinColumn(name = "fk_materias")
    @NonNull
    private  Materia materia;

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

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    @NonNull
    public FichaEstudiante getFichaEstudiante() {
        return fichaEstudiante;
    }

    public void setFichaEstudiante(@NonNull FichaEstudiante fichaEstudiante) {
        this.fichaEstudiante = fichaEstudiante;
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
        return getAnio().equals(nota.getAnio()) && getFichaEstudiante().equals(nota.getFichaEstudiante()) && getCurso().equals(nota.getCurso()) && getMateria().equals(nota.getMateria()) && getExamen_1().equals(nota.getExamen_1()) && getExamen_2().equals(nota.getExamen_2()) && getExamen_3().equals(nota.getExamen_3()) && getExamen_4().equals(nota.getExamen_4()) && getPromedio().equals(nota.getPromedio()) && getRecuperacion_1().equals(nota.getRecuperacion_1()) && getRecuperacion_2().equals(nota.getRecuperacion_2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnio(), getFichaEstudiante(), getCurso(), getMateria(), getExamen_1(), getExamen_2(), getExamen_3(), getExamen_4(), getPromedio(), getRecuperacion_1(), getRecuperacion_2());
    }
}