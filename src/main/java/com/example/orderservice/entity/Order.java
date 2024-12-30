package com.example.orderservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "order_tbl")
public class Order {

    @Id
    private Long id;
    private Long productId;
    private Integer quantity;

}
