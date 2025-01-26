package com.milind.journalismservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.milind.journalismservice.entities.Vote;
import com.milind.journalismservice.enums.CitizenStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@MappedSuperclass
public class CitizenDto {

    private String name;
    private String aadharNumber;
    @JsonIgnore
    private String password;
    @Enumerated(EnumType.STRING)
    private CitizenStatus status;
    @OneToMany(mappedBy = "citizen", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vote> votesGiven;
}
