package com.milind.journalismservice.entities;

import com.milind.journalismservice.enums.VotingTopics;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String reportHeading;

    private String reportContent;

    private LocalDateTime timeOfPublishing;

    @Enumerated(EnumType.STRING)
    private VotingTopics topic;

    private String reportUrl;

    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;  // Fixed the relationship to ensure proper column naming and foreign key reference
}
