package employeeDataUsingAop;

import java.util.List;

public interface EmployeeRepository {

	List<EmployeePojo> findAllEmployee() throws Exception;

	List<EmployeePojo> findEmployee(int id) throws Exception;

	List<EmployeePojo> removeEmployee(int id, String name) throws Exception;

	void addEmplpoyee(int id, String name, Double salary) throws Exception;

}
