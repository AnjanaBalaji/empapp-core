package com.revature.empapp.test;

import com.revature.empapp.dao.EmployeeDAO;
import com.revature.empapp.model.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName("anu");
		emp.setDesignation("consultant");
		
		EmployeeDAO dao=new EmployeeDAO();
		dao.save(emp);
		

	}

}
