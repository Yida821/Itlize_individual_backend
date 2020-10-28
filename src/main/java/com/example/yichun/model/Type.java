package com.example.yichun.model;

import javax.persistence.*;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String userType;

    @Column
    private String application;

    @Column
    private String mountingLocation;

    @Column
    private String accessories;

    @Column
    private String modelYear;

    @OneToOne (
            mappedBy = "type",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private Product product;
}
