package com.repoinc.escuela.Factory;

import com.repoinc.escuela.modelo.Jornada;
import com.repoinc.escuela.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JornadaFactory {

    @Autowired
    private JornadaRepository jornadaRepository;

    public List<Jornada> constuyeJornada(int num){

        List<Jornada> listaJornada = new ArrayList<>();

        for (int i = 0; i < num; i++){

            Jornada jornada = new Jornada();
            jornada.setJornada("Lunes");

            listaJornada.add(jornada);
        }
        return listaJornada;
    }

    public List<Jornada> creaJornada(int num){

        List<Jornada> listaConstruye = constuyeJornada(num);
        List<Jornada> baseDatos = new ArrayList<>();

        for (Jornada jornada : listaConstruye){

            Jornada agregado = jornadaRepository.save(jornada);
            baseDatos.add(agregado);
        }
        return baseDatos;
    }
}