package com.repoinc.escuela.Factory;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.repoinc.escuela.modelo.Curso;
import com.repoinc.escuela.modelo.FichaEstudiante;
import com.repoinc.escuela.repository.FichaEstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FichaEstudianteFactory {
   
 @Autowired
 private FichaEstudianteRepository  fichaEstudianteRepository;

public List<FichaEstudiante> construyeFichaEstudiante(int num) throws ParseException {

    List<FichaEstudiante> estudiantes = new ArrayList<>();

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

    for(int i=0; i<num; i++){

        FichaEstudiante fichaEstudiante = new FichaEstudiante();

        fichaEstudiante.setNombre("nombre");
        fichaEstudiante.setApellidos("apellidos");
        fichaEstudiante.setDireccion("direccion");
        fichaEstudiante.setFechaNacimiento(dateFormat.parse("2021-01-01 00:00:00"));
        fichaEstudiante.setSexo("sexo");
        fichaEstudiante.setPadre("papa");
        fichaEstudiante.setMadre("mama");
        fichaEstudiante.setFechaMatricula(dateFormat.parse("2021-01-01 00:00:00"));

        estudiantes.add(fichaEstudiante);
    }
    return estudiantes;
}
public List<FichaEstudiante> creaFichaEstudiante(int num) throws ParseException {

    List<FichaEstudiante> listaConstruye = construyeFichaEstudiante(num);
    List<FichaEstudiante> listaGuardada = new ArrayList<>();

    for (FichaEstudiante fichaEstudiante : listaConstruye) {

        FichaEstudiante estudianteGuardado = fichaEstudianteRepository.save(fichaEstudiante);

        listaGuardada.add(estudianteGuardado);
        
    }
    return listaGuardada;
}

}