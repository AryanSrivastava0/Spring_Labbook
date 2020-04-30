package com.labbook.lab402.service;

import java.util.List;

import com.labbook.lab402.entity.Product;
import com.labbook.lab402.entity.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}

