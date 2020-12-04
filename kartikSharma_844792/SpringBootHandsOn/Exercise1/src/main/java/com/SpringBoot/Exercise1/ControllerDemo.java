package com.SpringBoot.Exercise1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

	@RequestMapping(value = "/getEmployee" ,method =RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeePojo getEmploye() {
		
		EmployeePojo employee = new EmployeePojo("kartik", 1, 22000.0);
		
		return employee;
		
	}
	
	@PostMapping(value = "/addEmployee",consumes=MediaType.APPLICATION_JSON_VALUE   ,produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeePojo addEmployee(@RequestBody EmployeePojo request) {
		int i = (int)(Math.random()*420);
		request.setId(i);	
		return request;
	}
	
	
	
	
}
