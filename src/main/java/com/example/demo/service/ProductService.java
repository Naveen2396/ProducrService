package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;



public interface ProductService {
	
public List<Product> getAllProducts();
	
	public Product getByid(Integer id);
	
	public void saveOrUpdate(Product user);
	
	public void deleteUser(Integer id);

}
