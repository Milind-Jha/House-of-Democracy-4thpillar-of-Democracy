package com.milind.journalismservice.service;

import com.milind.journalismservice.dto.CitizenDto;
import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.response.CitizenResponse;

public interface CitizenService {

    CitizenResponse createNewCitizen(CitizenDto citizen);
    CitizenResponse updateCitizen(String id,Citizen citizen);
    CitizenResponse getCitizen(String id);
    void deleteCitizen(String id);

}
