package com.repoinc.escuela.Factory;

import com.repoinc.escuela.modelo.*;
import com.repoinc.escuela.repository.CobroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CobroFactory {

    @Autowired
    private CobroRepository cobroRepository;

    public List<Cobro> construyeCobro(
            int numCrobro,
            FichaEstudiante fichaEstudiante,
            ConceptoPago conceptoPago,
            Jornada jornada,
            Empleado empleado){

        List<Cobro> listaCobros = new ArrayList<>();

        for(int i=1; i<numCrobro; i++){

            Cobro cobro = new Cobro();

            cobro.setFechaCobro(new Date());
            cobro.setPrecio(235.45F);
            cobro.setCantidad(2);
            cobro.setTotal(10F);
            cobro.setFichaEstudiante(fichaEstudiante);
            cobro.setConceptoPago(conceptoPago);
            cobro.setJornada(jornada);
            cobro.setEmpleado(empleado);

            listaCobros.add(cobro);
        }

        return listaCobros;
    }

    public List<Cobro> creaCobros(
            int numCrobro,
            FichaEstudiante fichaEstudiante,
            ConceptoPago conceptoPago,
            Jornada jornada,
            Empleado empleado) {

        List<Cobro> listaConstruye = construyeCobro(numCrobro, fichaEstudiante, conceptoPago, jornada, empleado);
        List<Cobro> baseDatos = new ArrayList<>();

        for (Cobro cobro : listaConstruye){

            Cobro agregado = cobroRepository.save(cobro);
            baseDatos.add(agregado);
        }

        return baseDatos;
    }

}