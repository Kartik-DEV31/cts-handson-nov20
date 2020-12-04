package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeController {

	List<EmployeePojo> getAllEmploye();

	Optional<EmployeePojo> findEmployee(@PathVariable int id);

	EmployeePojo addEmployee(@RequestBody EmployeePojo request);

	EmployeePojo updateEmployee(@RequestBody EmployeePojo request);

	String deleteEmployee(@RequestBody EmployeePojo request);

}
