package com.labbook.lab4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.labbook.lab4.dao.EmployeeDaoInterface;
import com.labbook.lab4.dto.EmployeeEx;

@Component
public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	EmployeeDaoInterface empDao;
	
	public EmployeeEx getEmpId(int id) {
		return empDao.getEmpId(id);
	}
//	@Autowired
//	EmployeeDaoInterface empDao1;
//	
//	public EmployeeEx viewEmpById(int empId)
//	{
//		return empDao1.viewEmpById(empId);
//		
//	}

}
