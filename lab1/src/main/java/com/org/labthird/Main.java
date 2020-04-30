package com.org.labthird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	     
	      ApplicationContext context1 = new ClassPathXmlApplicationContext("Bean3.xml");
	      SBU s=(SBU) context1.getBean("sbu");
	      ApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
	      Employee e = (Employee) context.getBean("employee");
	      System.out.println("sbu detail------------------");
	      System.out.println("sbu detail"+"= "+s.getSbuID()+" "+ s.getSbuName()+" "+s.getSbuHead());
          System.out.println("employee detail---------------");
          e.getEmployeelist();
	   }
}
