package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {

	@Autowired
	DaoDemo daoDemo;
	
	String time() {
		
	return	daoDemo.time();
		
	}
	
	
	List<EmployeePojo> findAllEmployee() {
		
		
		return daoDemo.findAllEmployee();
		
	}
	
	
}
