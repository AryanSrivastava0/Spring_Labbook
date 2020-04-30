package com.org.labsecond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int id;
	  private String name;
	  private double salary;
	  private int age;
	 private SBU sbu;
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
	public SBU getSbu() {
		return sbu;
	}
	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	public Employee(int id, String name, double salary,int age)
	{
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
	
	
	  

