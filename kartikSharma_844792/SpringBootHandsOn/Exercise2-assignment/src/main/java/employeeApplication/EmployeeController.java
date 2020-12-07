package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeController {

	List<EmployeePojo> getAllEmploye();

	ResponseEntity<Object> findEmployee(@PathVariable int id);

	EmployeePojo addEmployee(@RequestBody EmployeePojo request);

	ResponseEntity<Object> updateEmployee(@RequestBody EmployeePojo request);

	ResponseEntity<Object> deleteEmployee(@RequestBody EmployeePojo request);

}
