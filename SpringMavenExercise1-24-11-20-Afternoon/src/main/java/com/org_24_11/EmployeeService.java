package com.org_24_11;

public class EmployeeService implements Service {
	
EmployeeDao dao ;


public EmployeeDao getDao() {
	return dao;
}


public void setDao(EmployeeDao dao) {
	this.dao = dao;
}


public void storeEmployee(){
	
	System.out.println("StoreEmployee method of EmployeeService");
	dao.store();
	
}
	


}
