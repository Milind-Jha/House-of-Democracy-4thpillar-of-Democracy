package com.milind.journalismservice.repository;

import com.milind.journalismservice.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report,Long> {
}
