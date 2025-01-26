package com.milind.journalismservice.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.milind.journalismservice.dto.CitizenDto;
import com.milind.journalismservice.entities.Citizen;

public class CitizenMapper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Citizen toEntity(CitizenDto citizenDto) {
        return objectMapper.convertValue(citizenDto, Citizen.class);
    }

    public static CitizenDto toDto(Citizen citizen) {
        return objectMapper.convertValue(citizen, CitizenDto.class);
    }
}