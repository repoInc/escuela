package com.repoinc.escuela.Factory;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.repoinc.escuela.modelo.Curso;
import com.repoinc.escuela.modelo.FichaEstudiante;
import com.repoinc.escuela.repository.FichaEstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class fichaEstudianteFactory {
   
 @Autowired
 private FichaEstudianteRepository  fichaEstudianteRepository;

public List<FichaEstudiante> construyeFichaEstudiante(int numFicha, Curso curso){

    List<FichaEstudiante> estudiantes = new ArrayList<>();
    for(int i=1; i<numFicha; i++){

        FichaEstudiante fichaEstudiante = new FichaEstudiante();

        fichaEstudiante.setNombre("nombre");
        fichaEstudiante.setApellidos("apellidos");
        fichaEstudiante.setDireccion("direccion");
        fichaEstudiante.setFechaNacimiento(new Date());
        fichaEstudiante.setSexo("sexo");
        fichaEstudiante.setPadre("papa");
        fichaEstudiante.setMadre("mama");
        fichaEstudiante.setFechaMatricula(new Date());
        fichaEstudiante.setCurso(curso);

        estudiantes.add(fichaEstudiante);
    }
    return estudiantes;
}
public List<FichaEstudiante> creaFichaEstudiante(int numFicha, Curso curso){

    List<FichaEstudiante> listaConstruye = construyeFichaEstudiante(numFicha, curso);
    List<FichaEstudiante> listaGuardada = new ArrayList<>();

    for (FichaEstudiante fichaEstudiante : listaConstruye) {

        FichaEstudiante estudianteGuardado = fichaEstudianteRepository.save(fichaEstudiante);

        listaGuardada.add(estudianteGuardado);
        
    }
    return listaGuardada;
}

}
