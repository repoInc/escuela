package com.repoinc.escuela.serviceTest;

import com.repoinc.escuela.Factory.*;
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

import java.text.ParseException;
import java.util.List;

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

    @Autowired
    private FichaEstudianteFactory fichaEstudianteFactory;

    @Autowired
    private ConceptoPagoFactory conceptoPagoFactory;

    @Autowired
    private JornadaFactory jornadaFactory;

    @Autowired
    private EmpleadoFactory empleadoFactory;

    @Test
    void getAllCobro() throws ParseException {

        // Prepara

        ConceptoPago conceptoPago = conceptoPagoFactory.creaConceptoPago(1).get(0);
        Jornada jornada = jornadaFactory.creaJornada(1).get(0);
        FichaEstudiante fichaEstudiante = fichaEstudianteFactory.creaFichaEstudiante(1).get(0);

        Empleado empleado = empleadoFactory.creaEmpleados(1).get(0);

        List<Cobro> lista =  cobroFactory.creaCobros(1, fichaEstudiante, conceptoPago, jornada, empleado);

        // Actua

        List<CobroDto> cobrosServ = cobroService.getAllCobro();

        // Afirma

        Assertions.assertEquals(lista.size(), cobrosServ.size());
    }
}