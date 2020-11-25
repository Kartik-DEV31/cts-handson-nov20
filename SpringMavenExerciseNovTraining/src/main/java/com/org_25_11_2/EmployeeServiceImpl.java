package com.org_25_11_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
@Autowired
EmployeeDaoImpl dao2 ;


public EmployeeDaoImpl getDao2() {
	return dao2;
}


public void setDao2(EmployeeDaoImpl dao2) {
	this.dao2 = dao2;
}


public void storeEmployee(){
	
	System.out.println("StoreEmployee method of EmployeeService");
	dao2.store();
	
}
	


}
