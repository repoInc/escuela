package com.repoinc.escuela.service;

import com.repoinc.escuela.dto.CobroDto;
import com.repoinc.escuela.modelo.*;
import com.repoinc.escuela.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Service
public class CobroService {

    // Inyeccion de repositorios

    @Autowired
    private CobroRepository cobroRepository;

    @Autowired
    private FichaEstudianteRepository fichaEstudianteRepository;

    @Autowired
    private ConceptoPagoRepository conceptoPagoRepository;

    @Autowired
    private JornadaRepository jornadaRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Inicio de los metodos del Service

    @Transactional
    public List<CobroDto> getAllCobro(){

        List<Cobro> cobros = cobroRepository.findAll();

        List<CobroDto> dto = new ArrayList<>();

        for(Cobro cobro : cobros){
            dto.add(entidad_a_dto(cobro));
        }

        return dto;
    }

    public CobroDto entidad_a_dto(Cobro cobro) {

        CobroDto cobroDto = new CobroDto();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        // cobroDto.setIdCobro(cobro.getIdCobro());
        cobroDto.setFechaCobro(dateFormat.format(cobro.getFechaCobro()));
        cobroDto.setPrecio(cobro.getPrecio());
        cobroDto.setCantidad(cobro.getCantidad());
        cobroDto.setTotal(cobro.getTotal());
        cobroDto.setFichaEstudiante(cobro.getFichaEstudiante());
        cobroDto.setConceptoPago(cobro.getConceptoPago());
        cobroDto.setJornada(cobro.getJornada());
        cobroDto.setEmpleado(cobro.getEmpleado());

        return cobroDto;
    }

    public Cobro dto_a_entidad(CobroDto cobroDto) throws Exception {

        Cobro cobro = new Cobro();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        FichaEstudiante fichaEstudiante = fichaEstudianteRepository.findById(cobro.getFichaEstudiante().getId())
                .orElseThrow(() -> new Exception("No existe ninguna fichaEstudiante"));

        ConceptoPago conceptoPago = conceptoPagoRepository.findById(cobro.getConceptoPago().getId())
                .orElseThrow(() -> new Exception("No existe ningun ConceptoPAgo"));

        Jornada jornada = jornadaRepository.findById(cobro.getJornada().getId())
                .orElseThrow(() -> new Exception ("No existe ninguna Jornada"));

        Empleado empleado = empleadoRepository.findById(cobro.getEmpleado().getId())
                .orElseThrow(() -> new Exception("No existe ningun Empleado"));

        // cobro.setIdCobro(cobroDto.getIdCobro());
        cobro.setFechaCobro(dateFormat.parse("2021-01-01 00:00:00"));
        cobro.setPrecio(cobroDto.getPrecio());
        cobro.setCantidad(cobroDto.getCantidad());
        cobro.setTotal(cobroDto.getTotal());
        cobro.setFichaEstudiante(fichaEstudiante);
        cobro.setConceptoPago(conceptoPago);
        cobro.setJornada(jornada);
        cobro.setEmpleado(empleado);

        return cobro;
    }
}