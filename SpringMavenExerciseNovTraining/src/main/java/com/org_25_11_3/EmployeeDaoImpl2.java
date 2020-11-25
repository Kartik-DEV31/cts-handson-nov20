package com.org_25_11_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl2 implements EmployeeDao{
	
	@Autowired
	DBconfig dbconfig;

	public void setDbconfig(DBconfig dbconfig) {
		this.dbconfig = dbconfig;
	}
	

	public void store() {
		System.out.println("Store method of EmployeeDao");

			System.out.println(dbconfig);
		

	}




	




	
	

	
}
