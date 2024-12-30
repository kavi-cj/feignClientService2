package com.example.orderservice.entity;


import javax.persistence.Id;

import lombok.Data;

@Data
public class Product {

    @Id
    private Long id;
    private String name;
    private Double price;

}
