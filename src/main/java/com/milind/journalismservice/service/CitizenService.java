package com.milind.journalismservice.service;

import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.response.CitizenResponse;

public interface CitizenService {

    CitizenResponse createNewCitizen(Citizen citizen);
    CitizenResponse updateCitizen(String id,Citizen citizen);
    CitizenResponse getCitizen(String id);
    void deleteCitizen(String id);

}
