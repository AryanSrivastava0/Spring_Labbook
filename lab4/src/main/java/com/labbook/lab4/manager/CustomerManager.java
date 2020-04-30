package com.labbook.lab4.manager;

import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.labbook.lab4.model.Customer;

@Controller
public class CustomerManager {

	public Optional<Customer> getCustomer(String id) {

		if (id.equals("1")) {
			return Optional.empty();
		} else {
			Customer cust = new Customer("1", "product-name1");
			cust.setPrice(id);
			return Optional.of(cust);
		}

	}
}
