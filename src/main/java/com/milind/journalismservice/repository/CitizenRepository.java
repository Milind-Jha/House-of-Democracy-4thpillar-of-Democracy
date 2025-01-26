package com.milind.journalismservice.repository;

import com.milind.journalismservice.dto.CitizenDto;
import com.milind.journalismservice.entities.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,String> {

}
