package com.repoinc.escuela.Factory;

import com.repoinc.escuela.modelo.*;
import com.repoinc.escuela.repository.CobroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Component
public class CobroFactory {

    @Autowired
    private CobroRepository cobroRepository;

    public List<Cobro> construyeCobro(
            int numCobro,
            FichaEstudiante fichaEstudiante,
            ConceptoPago conceptoPago,
            Jornada jornada,
            Empleado empleado) throws ParseException {

        List<Cobro> listaCobros = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        for(int i=0; i<numCobro; i++){

            Cobro cobro = new Cobro();

            cobro.setFechaCobro(dateFormat.parse("2021-01-01 00:00:00"));
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
            int numCobro,
            FichaEstudiante fichaEstudiante,
            ConceptoPago conceptoPago,
            Jornada jornada,
            Empleado empleado) throws ParseException {

        List<Cobro> listaConstruye = construyeCobro(numCobro, fichaEstudiante, conceptoPago, jornada, empleado);
        List<Cobro> baseDatos = new ArrayList<>();

        for (Cobro cobro : listaConstruye){

            Cobro agregado = cobroRepository.save(cobro);
            baseDatos.add(agregado);
        }

        return baseDatos;
    }

}