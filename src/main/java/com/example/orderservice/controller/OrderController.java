package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.client.ProductClient;
import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.Product;
import com.example.orderservice.entity.repo.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;
    
    @PostMapping("/order")
    public String createOrder(@RequestBody Order order) {
    	Product product = productClient.getProductById(order.getProductId());
    	if(product != null) {
    		orderRepository.save(order);
            return "Order created successfully for product: " + product.getName();
          }
          return "Product not found...";    		
   }
    
}

