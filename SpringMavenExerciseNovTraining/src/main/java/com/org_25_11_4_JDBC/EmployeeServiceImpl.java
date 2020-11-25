package com.org_25_11_4_JDBC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public void storeEmployee(EmployeeDao dao )  {
		
		repo.store(dao);
		
	}

}
