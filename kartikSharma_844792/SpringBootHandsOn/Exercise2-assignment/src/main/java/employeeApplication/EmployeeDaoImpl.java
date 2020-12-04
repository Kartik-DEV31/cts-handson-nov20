package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	employeeRepository repository;

	@Override
	public List<EmployeePojo> displayAll() {

		return repository.findAll();
	}

	@Override
	public Optional<EmployeePojo> findEmployee(int id) {

		return repository.findById(id);
	}

	@Override
	public EmployeePojo addEmployee(Integer id, String name, Double salary) {

		EmployeePojo pojo = new EmployeePojo(id, name, salary);

		return repository.save(pojo);

	}

	@Override
	public EmployeePojo updateEmployee(Integer id, String name, Double salary) {

		EmployeePojo pojo = new EmployeePojo(id, name, salary);

		return repository.save(pojo);

	}

	@Override
	public void deleteEmployee(Integer id) {
		repository.deleteById(id);

	}

}
