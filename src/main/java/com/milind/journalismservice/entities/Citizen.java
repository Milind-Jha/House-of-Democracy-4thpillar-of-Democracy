package com.milind.journalismservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.milind.journalismservice.enums.CitizenStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String aadharNumber;
    @JsonIgnore
    private String password;
    @Enumerated(EnumType.STRING)
    private CitizenStatus status;
    @OneToMany(mappedBy = "citizen", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vote> votesGiven;
}
