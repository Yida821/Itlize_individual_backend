package com.example.yichun.model;

import javax.persistence.*;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String subCategoryName;

    @ManyToOne (cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示company不能为空
    @JoinColumn(name="category_id")//设置在employee表中的关联字段(外键)，另注意因为这里已经写了company_id,所以员工类不用在写companyId这个属性
    private Category category;

    @OneToOne (
            mappedBy = "subCategory",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private Product product;
}
