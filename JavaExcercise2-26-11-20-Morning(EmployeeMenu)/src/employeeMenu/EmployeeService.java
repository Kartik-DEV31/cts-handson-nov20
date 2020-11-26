package employeeMenu;

import java.util.List;

public interface EmployeeService {
		
	void add(Integer id, String dob, String name, Double salary);
	List findEmployeeById(Integer id);
	List getEmployees();
	List getSortedEmployeesById();
	List getSortedEmployeesBySalary();
	List getSortedEmployeesByName();

	
	
}
