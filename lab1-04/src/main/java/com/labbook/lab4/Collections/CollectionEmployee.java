package com.labbook.lab4.Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.labbook.lab4.dto.EmployeeEx;
	@Configuration
	public class CollectionEmployee 
	{
		private List<EmployeeEx> emplist=new ArrayList<EmployeeEx>();
		
		@Bean
		public List<EmployeeEx> getEmpList()
		{
			emplist.add(new EmployeeEx(1,"Aryan",80000.0));
			emplist.add(new EmployeeEx(2,"Shaurya",85000.0));
			emplist.add(new EmployeeEx(3,"Deepak",90000.0));
			emplist.add(new EmployeeEx(4,"vaishali",95000.0));

			return emplist;
		}

}
