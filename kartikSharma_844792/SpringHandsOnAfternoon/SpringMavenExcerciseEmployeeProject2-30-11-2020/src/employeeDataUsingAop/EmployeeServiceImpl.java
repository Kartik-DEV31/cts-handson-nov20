package employeeDataUsingAop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public List<EmployeePojo> findAllEmployee() throws Exception {

		return repository.findAllEmployee();

	}

	@Override
	public List<EmployeePojo> findEmployee(int id) throws Exception {
		// TODO Auto-generated method stub
		return repository.findEmployee(id);
	}

	@Override
	public List<EmployeePojo> removeEmployee(int id, String name) throws Exception {

		return repository.removeEmployee(id, name);
	}

}
