package com.milind.journalismservice.repository;

import com.milind.journalismservice.entities.Citizen;
import com.milind.journalismservice.entities.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist,String> {
}
