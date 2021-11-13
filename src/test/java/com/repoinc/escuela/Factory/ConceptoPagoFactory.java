package com.repoinc.escuela.Factory;

import com.repoinc.escuela.modelo.ConceptoPago;
import com.repoinc.escuela.repository.ConceptoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConceptoPagoFactory {

    @Autowired
    private ConceptoPagoRepository conceptoPagoRepository;

    public List<ConceptoPago> construyeConceptoPago(int num){

        List<ConceptoPago> listaConcepto = new ArrayList<>();

        for (int i = 0; i < num; i++){

            ConceptoPago conceptoPago = new ConceptoPago();

            conceptoPago.setConcepto("PC");
            conceptoPago.setPrecio(500F);

            listaConcepto.add(conceptoPago);
        }
        return listaConcepto;
    }

    public List<ConceptoPago> creaConceptoPago(int num){

        List<ConceptoPago> listaConstruye = construyeConceptoPago(num);
        List<ConceptoPago> baseDatos = new ArrayList<>();

        for (ConceptoPago concepto : listaConstruye){

            ConceptoPago agregado = conceptoPagoRepository.save(concepto);
            baseDatos.add(agregado);
        }
        return baseDatos;
    }
}