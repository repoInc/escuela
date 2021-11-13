package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "materia")
    private String materia;

    @ManyToOne
    @JoinColumn(name = "fk_cursos")
    @NonNull
    private  Curso curso;

    @ManyToOne
    @JoinColumn(name = "fk_maestros")
    @NonNull
    private  Maestro maestro;

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

    @NonNull
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(@NonNull Curso curso) {
        this.curso = curso;
    }

    @NonNull
    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(@NonNull Maestro maestro) {
        this.maestro = maestro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia1 = (Materia) o;
        return getId().equals(materia1.getId()) && getMateria().equals(materia1.getMateria()) && getCurso().equals(materia1.getCurso()) && getMaestro().equals(materia1.getMaestro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMateria(), getCurso(), getMaestro());
    }
}