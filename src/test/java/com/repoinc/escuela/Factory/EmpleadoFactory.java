package com.repoinc.escuela.Factory;

import com.repoinc.escuela.modelo.Empleado;
import com.repoinc.escuela.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpleadoFactory {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> construyeEmpleado(int num) {

        List<Empleado> listaEmpleados = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            Empleado empleado = new Empleado();

            empleado.setNombre("Nelson");
            empleado.setApellido("Jaime");
            empleado.setDireccion("Barcelona");
            empleado.setTelefono("11111111111");
            empleado.setEmail("abc@abc.com");

            listaEmpleados.add(empleado);
        }
        return listaEmpleados;
    }

    public List<Empleado> creaEmpleados(int num){

        List<Empleado> listaConstruye = construyeEmpleado(num);
        List<Empleado> baseDatos = new ArrayList<>();

        for (Empleado empleado : listaConstruye){

            Empleado agregado = empleadoRepository.save(empleado);
            baseDatos.add(agregado);
        }
        return baseDatos;
    }
}