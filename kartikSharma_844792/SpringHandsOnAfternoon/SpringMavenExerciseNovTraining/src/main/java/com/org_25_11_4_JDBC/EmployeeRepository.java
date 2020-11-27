package com.org_25_11_4_JDBC;

import java.util.List;

public interface EmployeeRepository {

	void store(EmployeeDao dao);

	EmployeeDao findEmployeeById(Integer id);

	List<EmployeeDao> displayAllEmployees();

}
