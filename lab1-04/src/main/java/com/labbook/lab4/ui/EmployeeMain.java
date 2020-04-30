package com.labbook.lab4.ui;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.labbook.lab4.dto.EmployeeEx;
import com.labbook.lab4.service.EmployeeService;
import com.labbook.lab4.service.EmployeeServiceInterface;

public class EmployeeMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.labbook.lab4");
		context.refresh();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=input.nextInt();
		EmployeeServiceInterface empService=context.getBean(EmployeeService.class);
		EmployeeEx emp=empService.getEmpId(id);
		
		if(emp!=null) {
			System.out.println("Employee Detail");
			System.out.println("Emp id="+emp.getId()+"\n Emp Name="+emp.getName()+"\n Emp Salary="+emp.getSalary());
		}
		else
		{
			System.out.println("Employee not exist");
		}
		context.close();
	}

}

