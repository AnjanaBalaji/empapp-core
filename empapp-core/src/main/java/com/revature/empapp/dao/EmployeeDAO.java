package com.revature.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.empapp.model.Employee;
import com.revature.empapp.util.ConnectionUtil;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Employee employee) {
		String sql = "insert into emp(namee,designation) values (?,?)";
		Object[] params = { employee.getName(), employee.getDesignation() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println(rows);
	}
}
