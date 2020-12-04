package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeePojo> getAllEmploye() {

		return service.displayAll();

	}

	@GetMapping(value = "/findEmployee/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Optional<EmployeePojo> findEmployee(@PathVariable int id) {

		if (service.findEmployee(id).isEmpty())
			throw new RuntimeException("EmployeeNotExistException");

		return service.findEmployee(id);

	}

	@PostMapping(value = "/addEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeePojo addEmployee(@RequestBody EmployeePojo request) {
		int i = (int) (Math.random() * 420);
		request.setId(i);

		EmployeePojo employee = service.addEmployee(request.getId(), request.getName(), request.getSalary());

		return employee;

	}

	// to change/update use put mapping.
	@PutMapping(value = "/updateEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeePojo updateEmployee(@RequestBody EmployeePojo request) {

		Optional<EmployeePojo> empData = findEmployee(request.getId());

		EmployeePojo employee = service.updateEmployee(request.getId(), empData.get().getName(), request.getSalary());
		return employee;

	}

	@DeleteMapping(value = "/deleteEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteEmployee(@RequestBody EmployeePojo request) {

		service.deleteEmployee(request.getId());
		return "Employee Deleted Successfully";

	}

}
