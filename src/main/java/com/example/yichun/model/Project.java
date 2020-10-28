package com.example.yichun.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String projectName;

    @Column
    private String projectAddress;
    
    @Column
    private String projectType;

    @Column
    private  String projectSize;

//    @JsonBackReference
//    @ManyToOne(
////    		cascade= {CascadeType.ALL}
//    )
//    @JoinColumn(name="user_id")
//    private User user;


    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示company不能为空
    @JoinColumn(name="user_id")//设置在employee表中的关联字段(外键)，另注意因为这里已经写了company_id,所以员工类不用在写companyId这个属性
    private User user;

}
