package com.milind.journalismservice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.milind.journalismservice.dto.CitizenDto;
import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.repository.CitizenRepository;
import com.milind.journalismservice.response.CitizenResponse;
import com.milind.journalismservice.service.CitizenService;
import com.milind.journalismservice.util.CitizenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public CitizenResponse createNewCitizen(CitizenDto citizenDto) {
        Citizen citizen = citizenRepository.save(CitizenMapper.toEntity(citizenDto));
        System.out.println(citizenDto);
        CitizenResponse citizenResponse = new CitizenResponse();
        citizenResponse.setId(citizen.getId());
        citizenResponse.setName(citizenDto.getName());
        citizenResponse.setAadharNumber(citizenDto.getAadharNumber());
        citizenResponse.setStatus(citizenDto.getStatus());
        return citizenResponse;
    }

    @Override
    public CitizenResponse updateCitizen(String id, Citizen citizen) {
        return null;
    }

    @Override
    public CitizenResponse getCitizen(String id) {
        return null;
    }

    @Override
    public void deleteCitizen(String id) {

    }
}
