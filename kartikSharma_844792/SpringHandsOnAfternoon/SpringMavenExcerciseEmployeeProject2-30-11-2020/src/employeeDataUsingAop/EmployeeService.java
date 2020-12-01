package employeeDataUsingAop;

import java.util.List;

public interface EmployeeService {
	
	List<EmployeePojo> findAllEmployee() throws Exception;

	List<EmployeePojo> findEmployee(int id) throws Exception;

	List<EmployeePojo> removeEmployee(int id, String name) throws Exception;

}
