package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerDemo {
	
	@Autowired
	ServiceDemo service;
	
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public void add() {
		
		service.add();
		
	}

	@RequestMapping(value = "/display" , method = RequestMethod.GET)
	public void display() {
		
		
		System.out.println(service.display());
		
	}

	
	
}
