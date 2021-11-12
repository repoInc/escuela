package com.repoinc.escuela.serviceTest;

import com.repoinc.escuela.Factory.CobroFactory;
import com.repoinc.escuela.dto.CobroDto;
import com.repoinc.escuela.modelo.*;
import com.repoinc.escuela.repository.CobroRepository;
import com.repoinc.escuela.service.CobroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class CobroServiceTest {

    @Autowired
    private CobroFactory cobroFactory;

    @Autowired
    private CobroRepository cobroRepository;

    @Autowired
    private CobroService cobroService;

    @Test
    void getAllCobro() {

        // Prepara

        FichaEstudiante fichaEstudiante = new FichaEstudiante();
        ConceptoPago conceptoPago = new ConceptoPago();
        Jornada jornada = new Jornada();
        Empleado empleado = new Empleado();

        Cobro creaCobro = cobroFactory.creaCobros(1, fichaEstudiante, conceptoPago, jornada, empleado).get(0);

        List<Cobro> cobroRepo = cobroRepository.findAll();

        // Actua

        List<CobroDto> cobrosServ = cobroService.getAllCobro();

        // Afirma

        Assertions.assertEquals(cobroRepo.size(), cobrosServ.size());
    }
}