package com.org_25_11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// new approach, assuming this is a service layer

		// reads the xml file and creates all the objects of the classes you have
		// configured
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("service2");
		service.storeEmployee();
	

	}

}
