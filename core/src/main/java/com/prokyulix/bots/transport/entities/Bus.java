package com.prokyulix.bots.transport.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @OneToMany(mappedBy = "bus", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Waypoint> waypoints;

    @Column
    private String description;
}
