package com.repoinc.escuela.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.repoinc.escuela.modelo.Curso;

import org.springframework.lang.NonNull;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue
    private Long idEstudiante;

    private String nombre;

    private String apellidos;

    private String direccion;

    private Date fechaNacimiento;

    private String sexo;

    private String padre;

    private String madre;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    @NonNull
    private Curso curso;
    

}
