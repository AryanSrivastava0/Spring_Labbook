package com.labbook.lab4.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.labbook.lab4.Collections.CollectionEmployee;
import com.labbook.lab4.dto.EmployeeEx;

@Component
public class EmployeeDao implements EmployeeDaoInterface{
	ApplicationContext factory=new AnnotationConfigApplicationContext(CollectionEmployee.class);
	public EmployeeEx getEmpId(int id) {
		// TODO Auto-generated method stub
		List<EmployeeEx> empList=(List<EmployeeEx>) factory.getBean("getEmpList");
		for(EmployeeEx emp:empList) {
			if(emp.getId()==id)
			{
				return emp;
			}
		}
		return null;
	}
//	public EmployeeEx viewEmpById(int empId) {
//		List<EmployeeEx> empList=(List<EmployeeEx>) factory.getBean("getempList");
//		for(EmployeeEx emp:empList)
//		{
//			if(emp.getId()==empId)
//				return emp;
//		}
//		return null;
//	}

}

