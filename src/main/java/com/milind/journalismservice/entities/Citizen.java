package com.milind.journalismservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.milind.journalismservice.dto.CitizenDto;
import com.milind.journalismservice.enums.CitizenStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Getter
public class Citizen extends CitizenDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
