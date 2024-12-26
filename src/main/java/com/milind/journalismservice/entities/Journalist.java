package com.milind.journalismservice.entities;

import com.milind.journalismservice.enums.JournalistStatus;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Journalist {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String pressId;

    private String name;

    private String channelName;

    private String channelUrl;

    @Enumerated(EnumType.STRING)
    private JournalistStatus journalistStatus;

    @OneToMany(mappedBy = "journalist", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Report> reports;

}
