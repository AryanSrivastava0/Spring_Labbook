package com.labbook.lab3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.labbook.lab3.entity.Product;
import com.labbook.lab3.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/addproduct")
	public String addproduct(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_ADD");
		return "addproduct";
	}

	@PostMapping("/save_product")
	public String saveproduct(@ModelAttribute Product product, BindingResult bindingResult,
			HttpServletRequest request) {
		productService.addproduct(product);

		return "addproduct";
	}
}