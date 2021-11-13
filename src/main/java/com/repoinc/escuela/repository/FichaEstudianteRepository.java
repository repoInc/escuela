package com.repoinc.escuela.repository;

import com.repoinc.escuela.modelo.FichaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaEstudianteRepository extends JpaRepository<FichaEstudiante, Long> {
}