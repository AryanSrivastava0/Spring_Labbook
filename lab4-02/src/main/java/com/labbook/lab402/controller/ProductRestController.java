package com.labbook.lab402.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.labbook.lab402.entity.Product;
import com.labbook.lab402.entity.ProductOld;
import com.labbook.lab402.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<ProductOld> getAllProduct() {
		return productService.reterive();
	}
	
	@RequestMapping(value = "/v1/product", method = RequestMethod.GET)
	public List<Product> getAllProductv1() {
		return productService.reterivev1();
	}

	@RequestMapping("/addproduct")
	public ModelAndView addproduct(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		request.setAttribute("mode", "MODE_ADD");
		return mav;
	}

	@PostMapping("/save_product")
	public ModelAndView saveproduct(@ModelAttribute Product product, BindingResult bindingResult,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		productService.save(product);

		return mav;
	}

}
