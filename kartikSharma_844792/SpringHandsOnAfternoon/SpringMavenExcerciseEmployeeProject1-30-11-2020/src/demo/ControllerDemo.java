package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDemo {

	@Autowired
	ServiceDemo service;

	@RequestMapping(value = "/whatsTime", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("currentTimeAndDate", "timeAndDate", service.time());
		return mav;
	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String findEmployee(Model m) {

		List<EmployeePojo> employee = service.findAllEmployee();
System.out.println(employee);
		m.addAttribute("employee", employee);
		return "EmployeeData";
	}

	@RequestMapping(value = "/findEmployeeUsingModelandView", method = RequestMethod.GET)
	public ModelAndView findEmployeeUsingModelandView(ModelAndView model) {

		List<EmployeePojo> employee = service.findAllEmployee();
		model.addObject("employeeUsingModelandView", employee);
		model.setViewName("EmployeeData");
		return model;
	}

	/*
	 * Difference between Model & ModelAndView is Model (m.addAttribute and return
	 * string as jsp name) and
	 * 
	 * ModelAndView set both data and jsp name for the client
	 * model.addObject("employeeUsingModelandView" , employee);
	 * model.setViewName("EmployeeData"); return model ;
	 */
	
	
	/*
	 * Model is an interface while ModelMap is a class. ModelAndView is just a
	 * container for both a ModelMap and a View object. It allows a controller to
	 * return both as a single value.
	 */
	
	
	/*
	 * ModelMap - ModelMap class is basically a LinkedHashMap
	 * Better than Model as it treats data as Hashmap, so faster processing than Model.
	 * works same as Model
	 * example :  	public String findEmployee(ModelMap m) {

		List<EmployeePojo> employee = service.findAllEmployee();

		m.addAttribute("employee", employee);
		return "EmployeeData";
	}
	 *
	 */
	 
	

}
