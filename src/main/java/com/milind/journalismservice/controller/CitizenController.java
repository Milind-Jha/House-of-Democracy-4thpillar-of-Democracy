package com.milind.journalismservice.controller;

import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.response.CitizenResponse;
import com.milind.journalismservice.service.CitizenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @PostMapping("/signupUser")
    public ResponseEntity<CitizenResponse> createCitizen(@RequestBody Citizen citizen){
        CitizenResponse newCitizen = citizenService.createNewCitizen(citizen);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCitizen);
    }
}
