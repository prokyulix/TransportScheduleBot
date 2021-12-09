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

    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Bus bus;

    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Station station;

    @NonNull
    @Column(name = "arrive_time", nullable = false)
    private Time arriveTime;

    @Column
    private String description;
}
