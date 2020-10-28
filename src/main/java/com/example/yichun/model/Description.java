package com.example.yichun.model;

import javax.persistence.*;

@Entity
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String manufacturer;

    @Column
    private String series;

    @Column
    private String model;

    @OneToOne (
            mappedBy = "description",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private Product product;

}
