package com.milind.journalismservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private boolean voteOfCitizen;
    @ManyToOne
    @JoinColumn(name = "report_id", nullable = false)
    private Report report;
    private LocalDateTime voteDateStart;
    private LocalDateTime voteDateEnd;
    @ManyToOne
    @JoinColumn(name = "citizen_id", nullable = false)
    private Citizen citizen;
}
