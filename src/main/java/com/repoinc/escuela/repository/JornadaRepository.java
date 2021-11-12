package com.repoinc.escuela.repository;

import com.repoinc.escuela.modelo.Jornada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornadaRepository extends JpaRepository<Jornada, String> {
}