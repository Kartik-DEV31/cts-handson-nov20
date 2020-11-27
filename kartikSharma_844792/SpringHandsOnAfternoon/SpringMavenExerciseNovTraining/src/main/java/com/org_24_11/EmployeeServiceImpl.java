package com.org_24_11;

public class EmployeeServiceImpl implements Service {
	
EmployeeDaoImpl dao ;


public EmployeeDaoImpl getDao() {
	return dao;
}


public void setDao(EmployeeDaoImpl dao) {
	this.dao = dao;
}


public void storeEmployee(){
	
	System.out.println("StoreEmployee method of EmployeeService");
	dao.store();
	
}
	


}
