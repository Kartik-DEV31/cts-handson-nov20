package com.org_25_11_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl2 implements EmployeeService {
	
@Autowired
EmployeeDaoImpl2 dao2 ;


public EmployeeDaoImpl2 getDao2() {
	return dao2;
}


public void setDao2(EmployeeDaoImpl2 dao2) {
	this.dao2 = dao2;
}


public void storeEmployee(){
	
	System.out.println("StoreEmployee method of EmployeeService");
	dao2.store();
	
}
	


}
