package com.repoinc.escuela.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jornadas")
public class Jornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "jornada")
    private String jornada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return getId().equals(jornada1.getId()) && getJornada().equals(jornada1.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getJornada());
    }
}