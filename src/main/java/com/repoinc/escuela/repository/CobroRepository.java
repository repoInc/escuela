package com.repoinc.escuela.repository;

import com.repoinc.escuela.modelo.Cobro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobroRepository extends JpaRepository<Cobro, Long> {



}