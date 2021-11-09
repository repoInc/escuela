package com.repoinc.escuela.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    private String curso;

    private String modalidad;

    private String seccion;

    private String jornada;

   

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        result = prime * result + ((idCurso == null) ? 0 : idCurso.hashCode());
        result = prime * result + ((jornada == null) ? 0 : jornada.hashCode());
        result = prime * result + ((modalidad == null) ? 0 : modalidad.hashCode());
        result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (idCurso == null) {
            if (other.idCurso != null)
                return false;
        } else if (!idCurso.equals(other.idCurso))
            return false;
        if (jornada == null) {
            if (other.jornada != null)
                return false;
        } else if (!jornada.equals(other.jornada))
            return false;
        if (modalidad == null) {
            if (other.modalidad != null)
                return false;
        } else if (!modalidad.equals(other.modalidad))
            return false;
        if (seccion == null) {
            if (other.seccion != null)
                return false;
        } else if (!seccion.equals(other.seccion))
            return false;
        return true;
    }

    
}
