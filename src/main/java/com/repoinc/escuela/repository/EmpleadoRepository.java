package com.repoinc.escuela.repository;

import com.repoinc.escuela.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {


}