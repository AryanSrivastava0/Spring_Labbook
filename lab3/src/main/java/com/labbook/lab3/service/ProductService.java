package com.labbook.lab3.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labbook.lab3.dao.ProductDao;
import com.labbook.lab3.entity.Product;

@Service

public class ProductService {
	@Autowired
	ProductDao d;

	@Transactional
	public List<Product> product() {
		return (List<Product>) d.findAll();
	}

	@Transactional
	public boolean addproduct(Product p) {
		return d.save(p) != null;
	}

	@Transactional
	public Product update(int id, Product product) {
		return d.save(product);
	}
}

