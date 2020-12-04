package employeeApplication;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

	List<EmployeePojo> displayAll();

	Optional<EmployeePojo> findEmployee(int id);

	EmployeePojo addEmployee(Integer id, String name, Double salary) throws RuntimeException;

	EmployeePojo updateEmployee(Integer id, String string, Double salary) throws RuntimeException;

	EmployeePojo deleteEmployee(Integer id) throws RuntimeException;
	
	
}
