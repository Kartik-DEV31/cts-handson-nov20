package employeeApplication;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

	List<EmployeePojo> displayAll();

	Optional<EmployeePojo> findEmployee(int id) throws EmployeeNotFoundException;

	EmployeePojo addEmployee(Integer id, String name, Double salary) throws RuntimeException;

	EmployeePojo updateEmployee(Integer id, Double salary) throws EmployeeNotFoundException ;

	EmployeePojo deleteEmployee(Integer id) throws  EmployeeNotFoundException;
	
	
}
