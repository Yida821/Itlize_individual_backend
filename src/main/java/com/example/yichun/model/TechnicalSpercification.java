package com.example.yichun.model;

import javax.persistence.*;

@Entity
public class TechnicalSpercification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int airFlow;

    @Column
    private int power;

    @Column
    private int operatingVoltage;

    @Column
    private int fanSpeed;

    @OneToOne (
            mappedBy = "technicalSpecification",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private Product product;

}
