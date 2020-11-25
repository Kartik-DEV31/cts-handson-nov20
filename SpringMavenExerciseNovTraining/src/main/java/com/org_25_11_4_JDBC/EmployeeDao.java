package com.org_25_11_4_JDBC;

public class EmployeeDao {
	
	String name;
	Integer id;
	Double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public EmployeeDao(String name, Integer id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	

}
