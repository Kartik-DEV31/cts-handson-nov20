package com.SpringBoot.Exercise1;


public class EmployeePojo {
	
	String name;
	Integer id;
	Double Salary;
	
	
	
	public EmployeePojo(String name, Integer id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
	}
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
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	

}
