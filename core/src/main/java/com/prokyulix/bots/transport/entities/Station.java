package com.prokyulix.bots.transport.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "stations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "synchronization_code", nullable = false)
    private String synchronizationCode;

    @NonNull
    @Column(nullable = false)
    private String name;

    @Column(name = "sub_name")
    private String subName;

    @Column
    private String description;
}
