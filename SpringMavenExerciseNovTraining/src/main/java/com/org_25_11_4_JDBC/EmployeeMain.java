package com.org_25_11_4_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String... strings) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		EmployeeDao employee1 = new EmployeeDao("kartik", 1, 22000.0);
		EmployeeDao employee2 = new EmployeeDao("kunal", 2, 22000.0);
		EmployeeDao employee3 = new EmployeeDao("Ranjeet", 3, 22000.0);
		EmployeeDao employee4 = new EmployeeDao("Shubham", 4, 26000.0);
		EmployeeDao employee5 = new EmployeeDao("Vignesh", 5, 26000.0);
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
		service.storeEmployee(employee1);
		service.storeEmployee(employee2);
		service.storeEmployee(employee3);
		service.storeEmployee(employee4);
		service.storeEmployee(employee5);

		service.findEmployeeById(2);
		service.displayAllEmplpoyees();

	}

}
