package employeeMenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	Integer id;
	LocalDate dob;
	String name;
	Double salary;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public Employee(Integer id, LocalDate dob, String name, Double salary) {
		super();
		this.id = id;
		this.dob = dob;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", dob=" + dob.format(formatter) + ", name=" + name + ", salary=" + salary + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
