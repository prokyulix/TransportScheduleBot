package com.prokyulix.bots.transport.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "waypoints")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Waypoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Bus bus;

    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Station station;

    @Column(nullable = false)
    private Time time;

    @Column
    private String description;
}
