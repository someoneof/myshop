package com.example.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by 海峰 on 2017/3/6.
 */
@Entity
@ToString
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(nullable = false,length = 11)
    private String productName;

    @Column(nullable = false,length = 10)
    private Float productPrice;

    @Column
    private Boolean visible=true;

    @Column(length = 100)
    private String productDesc;

    @Column
    private String imagePath;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="venid")
    private Vendor vendor;

}
