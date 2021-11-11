package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jornadas")
public class Jornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String idJornada;

    @Column(name = "jornada")
    private String jornada;

    public String getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(String idJornada) {
        this.idJornada = idJornada;
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
        if (!(o instanceof Jornada)) return false;
        Jornada jornada1 = (Jornada) o;
        return getIdJornada().equals(jornada1.getIdJornada()) && getJornada().equals(jornada1.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdJornada(), getJornada());
    }
}