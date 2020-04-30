package com.org.labfirst;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int id;
	  private String name;
	  private double salary;
	  private int age;
	  private String BU;
	  
	
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


	public String getBU() {
		return BU;
	}


	public void setBU(String bU) {
		BU = bU;
	}


	public Employee(int id, String name, double salary,int age,String BU)
	{
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.BU= BU;
	}
}
	
	
	  

