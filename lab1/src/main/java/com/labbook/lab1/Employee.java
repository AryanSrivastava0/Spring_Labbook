package com.labbook.lab1;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int id;
	  private String name;
	  private double salary;
	  private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show()
	{
		System.out.println("Employee id"+" ="+20);
		System.out.println("Employee name"+"="+ "Aryan");
		System.out.println("Employee salary"+"="+ 10000000);
		System.out.println("Employee Age"+"="+21);
	}
	  
}
