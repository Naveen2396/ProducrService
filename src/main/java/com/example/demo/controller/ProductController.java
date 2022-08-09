package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Product;

import com.example.demo.service.ProductServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl impl;
	
	//http://localhost:8080/api/save

    @PostMapping(value="/save")
	public Product save(@RequestBody Product prd) {
		impl.saveOrUpdate(prd);
		return prd;
    }
    
    
    @GetMapping(value="/list")
	public List<Product> list(){
		return impl.getAllProducts();
    }
}
