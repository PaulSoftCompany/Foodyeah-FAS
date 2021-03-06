package com.paulsoft.foodyeah.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",unique=true,nullable=false)
    private Long id;

    private String name;

    @Column(name ="product_price")
    private Double productPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category_id",nullable = false)
    private ProductCategory productCategory;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    private List<OrderDetail> orders;


}