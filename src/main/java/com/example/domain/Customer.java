package com.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 海峰 on 2017/3/6.
 */
@Entity
@Data
@NoArgsConstructor
@ToString
public class Customer implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @Column(nullable = false,length = 11)
    private String nickName;

    @Column(nullable = false,length = 18)
    private String password;

    @Column(length = 11)
    private String cname;

    @Column(nullable = false,length = 30)
    private String cusAddress;

    @Column(nullable = false,length = 12)
    private String tel;

    @Column(length = 20)
    private String email;

    @OneToMany(mappedBy = "customer",cascade = {CascadeType.ALL})
    private Set<Orders> orders=new HashSet<>();
}
