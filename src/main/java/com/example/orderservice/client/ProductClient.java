package com.example.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.orderservice.entity.Product;

@FeignClient(name = "product-service", url = "${order.product-service.url}" )
public interface ProductClient {

	   @GetMapping("/product/{id}")
	   Product getProductById(@PathVariable Long id); 
	 
}
