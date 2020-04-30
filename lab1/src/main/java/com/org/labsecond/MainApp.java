package com.org.labsecond;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

      Employee e = (Employee) context.getBean("employee");
	     System.out.println("Employee"+"="+"["+ e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getAge()+"]");
	     System.out.println("sbu detail"+"="+"["+e.getSbu().getSbuID()+" "+e.getSbu().getSbName()+" "+e.getSbu().getSbHead()+"]");
   }
}