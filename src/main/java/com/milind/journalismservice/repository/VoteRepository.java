package com.milind.journalismservice.repository;


import com.milind.journalismservice.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,String> {
}
