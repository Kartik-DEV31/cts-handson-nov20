package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

public interface EmployeeDao {

	List<EmployeePojo> displayAll();

	Optional<EmployeePojo> findEmployee(int id);

	EmployeePojo addEmployee(Integer id, String name, Double salary);

	EmployeePojo updateEmployee(Integer id, String name, Double salary);

	void deleteEmployee(Integer id);
	
	
}
