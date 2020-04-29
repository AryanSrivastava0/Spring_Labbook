package com.labbook.lab3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labbook.lab3.entity.Product;



public interface ProductDao extends JpaRepository<Product, Integer> {

}