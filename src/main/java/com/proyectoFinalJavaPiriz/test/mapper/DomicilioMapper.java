package com.proyectoFinalJavaPiriz.test.mapper;

import com.proyectoFinalJavaPiriz.test.dto.DomicilioDTO;
import com.proyectoFinalJavaPiriz.test.model.Domicilio;

public class DomicilioMapper {

    public static DomicilioDTO toDTO(Domicilio domicilio) {
        DomicilioDTO dto = new DomicilioDTO();
        dto.setId(domicilio.getId());
        dto.setCalle(domicilio.getCalle());
        dto.setCiudad(domicilio.getCiudad());
        dto.setProvincia(domicilio.getProvincia());
        dto.setCodigoPostal(domicilio.getCodigoPostal());
        return dto;
    }

    public static Domicilio toEntity(DomicilioDTO dto) {
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(dto.getCalle());
        domicilio.setCiudad(dto.getCiudad());
        domicilio.setProvincia(dto.getProvincia());
        domicilio.setCodigoPostal(dto.getCodigoPostal());
        return domicilio;
    }
}
