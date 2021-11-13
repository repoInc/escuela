package com.repoinc.escuela.dto;


import java.util.Objects;

public class JornadaDto {

    private Long id;
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
        if (!(o instanceof JornadaDto)) return false;
        JornadaDto that = (JornadaDto) o;
        return getId().equals(that.getId()) && getJornada().equals(that.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getJornada());
    }
}