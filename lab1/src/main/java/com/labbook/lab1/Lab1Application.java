package com.labbook.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(Lab1Application.class, args);
		Employee e= context.getBean(Employee.class);
		e.show();
	}

}
