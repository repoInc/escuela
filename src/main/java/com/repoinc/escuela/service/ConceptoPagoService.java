package com.repoinc.escuela.service;

import com.repoinc.escuela.dto.ConceptoPagoDto;
import com.repoinc.escuela.modelo.ConceptoPago;
import com.repoinc.escuela.repository.ConceptoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConceptoPagoService {

    @Autowired
    private ConceptoPagoRepository conceptoPagoRepository;

    @Transactional
    public List<ConceptoPagoDto> getAllPagos() {

        List<ConceptoPago> listaPagos = conceptoPagoRepository.findAll();

        List<ConceptoPagoDto> dto = new ArrayList<>();

        for (ConceptoPago pago : listaPagos) {
            dto.add(entidad_a_dto(pago));
        }
        return dto;
    }

    public ConceptoPagoDto entidad_a_dto(ConceptoPago conceptoPago) {

        ConceptoPagoDto dto = new ConceptoPagoDto();

        dto.setId(conceptoPago.getId());
        dto.setConcepto(conceptoPago.getConcepto());
        dto.setPrecio(conceptoPago.getPrecio());

        return dto;
    }

    public ConceptoPago dto_a_entidad(ConceptoPagoDto dto) {

        ConceptoPago conceptoPago = new ConceptoPago();

        conceptoPago.setId(dto.getId());
        conceptoPago.setConcepto(dto.getConcepto());
        conceptoPago.setPrecio(dto.getPrecio());

        return conceptoPago;
    }
}