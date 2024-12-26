package com.milind.journalismservice.repository;

import com.milind.journalismservice.entities.VoteResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteResultRepository extends JpaRepository<VoteResult,Long> {
}
