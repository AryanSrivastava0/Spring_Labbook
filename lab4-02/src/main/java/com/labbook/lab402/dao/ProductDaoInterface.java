package com.labbook.lab402.dao;

import java.util.List;

import com.labbook.lab402.entity.Product;
import com.labbook.lab402.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}

