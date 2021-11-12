package com.repoinc.escuela.dto;


import java.util.Objects;

public class JornadaDto {

    private String idJornada;
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
        if (!(o instanceof JornadaDto)) return false;
        JornadaDto that = (JornadaDto) o;
        return Objects.equals(getIdJornada(), that.getIdJornada()) && Objects.equals(getJornada(), that.getJornada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdJornada(), getJornada());
    }
}