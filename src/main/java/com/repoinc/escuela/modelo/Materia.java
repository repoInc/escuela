package com.repoinc.escuela.modelo;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMateria;

    @Column(name = "materia")
    private String materia;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private  Curso curso;

    @ManyToOne
    @JoinColumn(name = "idMaestro")
    private  Maestro maestro;

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
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
        if (!(o instanceof Materia)) return false;
        Materia materia1 = (Materia) o;
        return getIdMateria().equals(materia1.getIdMateria()) && getMateria().equals(materia1.getMateria()) && getCurso().equals(materia1.getCurso()) && getMaestro().equals(materia1.getMaestro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdMateria(), getMateria(), getCurso(), getMaestro());
    }
}