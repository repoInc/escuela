package com.repoinc.escuela.service;

import com.repoinc.escuela.dto.CobroDto;
import com.repoinc.escuela.modelo.*;
import com.repoinc.escuela.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    // Comienzo de los metodos del Service

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

        // cobroDto.setIdCobro(cobro.getIdCobro());
        cobroDto.setFechaCobro(cobro.getFechaCobro());
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

        FichaEstudiante fichaEstudiante = fichaEstudianteRepository.findById(cobro.getFichaEstudiante().getIdEstudiante())
                .orElseThrow(() -> new Exception("No existe ninguna fichaEstudiante"));

        ConceptoPago conceptoPago = conceptoPagoRepository.findById(cobro.getConceptoPago().getIdConcepto())
                .orElseThrow(() -> new Exception("No existe ningun ConceptoPAgo"));

        Jornada jornada = jornadaRepository.findById(cobro.getJornada().getIdJornada())
                .orElseThrow(() -> new Exception ("No existe ninguna Jornada"));

        Empleado empleado = empleadoRepository.findById(cobro.getEmpleado().getIdEmpleado())
                .orElseThrow(() -> new Exception("No existe ningun Empleado"));

        // cobro.setIdCobro(cobroDto.getIdCobro());
        cobro.setFechaCobro(cobroDto.getFechaCobro());
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