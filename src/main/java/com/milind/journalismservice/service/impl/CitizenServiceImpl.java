package com.milind.journalismservice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.repository.CitizenRepository;
import com.milind.journalismservice.response.CitizenResponse;
import com.milind.journalismservice.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public CitizenResponse createNewCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
        System.out.println(citizen);
        CitizenResponse citizenResponse = new CitizenResponse();
        citizenResponse.setId(citizen.getId());
        citizenResponse.setName(citizen.getName());
        citizenResponse.setAadharNumber(citizen.getAadharNumber());
        citizenResponse.setStatus(citizen.getStatus());
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
