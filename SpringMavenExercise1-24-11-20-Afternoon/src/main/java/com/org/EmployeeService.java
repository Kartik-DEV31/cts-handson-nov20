package com.org;

public class EmployeeService {
	
EmployeeDao dao ;


public EmployeeDao getDao() {
	return dao;
}


public void setDao(EmployeeDao dao) {
	this.dao = dao;
}


void storeEmployee(){
	
	System.out.println("StoreEmployee method of EmployeeService");
	dao.store();
	
}
	


}
