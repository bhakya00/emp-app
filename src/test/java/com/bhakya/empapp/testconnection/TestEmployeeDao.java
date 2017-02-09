package com.bhakya.empapp.testconnection;

import com.bhakya.empapp.model.Employee;

public class TestEmployeeDao {
	public static void main (String [] args){
Employee e =new Employee();
e.setName("aaa");
e.setDesignation("ceo");
e.setId(1);
System.out.println(e);
	}
}
