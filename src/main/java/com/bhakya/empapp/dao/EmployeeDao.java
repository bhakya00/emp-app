package com.bhakya.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bhakya.empapp.model.Employee;
import com.bhakya.empapp.util.ConnectionUtil;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
public void save( Employee employee){
	String sql="insert into EMPLOYEE(name,designation)values(?,?)";
	Object[] params={employee.getName(),employee.getDesignation()};
	int rows=jdbcTemplate.update(sql,params);
	System.out.println(rows);
	
}

}
