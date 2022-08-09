package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)repo.findAll();
	}

	@Override
	public Product getByid(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Product user) {
		// TODO Auto-generated method stub
		repo.save(user);

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}
