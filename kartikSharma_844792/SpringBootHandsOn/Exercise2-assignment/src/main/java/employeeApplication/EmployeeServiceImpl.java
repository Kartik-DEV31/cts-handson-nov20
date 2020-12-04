package employeeApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	public List<EmployeePojo> displayAll() {
		return dao.displayAll();
	}

	@Override
	public Optional<EmployeePojo> findEmployee(int id) {

		return dao.findEmployee(id);

	}

	@Override
	public EmployeePojo addEmployee(Integer id, String name, Double salary) {

		EmployeePojo employee = dao.addEmployee(id, name, salary);
		return employee;

	}

	@Override
	public EmployeePojo updateEmployee(Integer id, String name, Double salary) {

		Optional<EmployeePojo> employeecheck = dao.findEmployee(id);
		if (employeecheck.isEmpty())
			throw new RuntimeException("EmployeeNotExistException");

		EmployeePojo employee = dao.updateEmployee(id, name, salary);
		return employee;

	}

	@Override
	public EmployeePojo deleteEmployee(Integer id) {

		Optional<EmployeePojo> employeecheck = dao.findEmployee(id);
		if (employeecheck.isEmpty())
			throw new RuntimeException("EmployeeNotExistException");

		dao.deleteEmployee(id);

		return null;
	}

}
