package com.example.domain;

import com.example.domain.supportBean.OrderState;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 海峰 on 2017/3/6.
 */
@Entity
@Data
@ToString
public class Orders implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate=new Date();

    @Enumerated(EnumType.STRING)
    private OrderState orderState=OrderState.WAITCONFIRM;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(mappedBy = "order",cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
    private Set<OrderItem> orderItems=new HashSet<>();

    public void addOrderItem(OrderItem orderItem){
        if(!this.orderItems.contains(orderItem)){
            this.orderItems.add(orderItem);
            orderItem.setOrder(this);
        }
    }

}
