package employeeDataUsingAop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;

	/*
	 * @RequestMapping(value = "/testing", method = RequestMethod.GET) public String
	 * testMethod(Model model) {
	 * 
	 * String testString = "XYZ"; model.addAttribute("testData", testString);
	 * 
	 * return "test"; }
	 */
	@RequestMapping(value = "/employeeDb", method = RequestMethod.GET)
	public String employeeData(Model model) {

		List<EmployeePojo> list = new ArrayList<EmployeePojo>();
		try {
			list = service.findAllEmployee();
		} catch (Exception e) {
			String exceptionMsg = "DatBaseError";
			model.addAttribute("exceptionMsg", exceptionMsg);
			return "forward:/index.jsp";

		}

		model.addAttribute("employee", list);

		return "EmployeeData";

	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String findEmployee(Model model, @RequestParam int id) {

		List<EmployeePojo> list = new ArrayList<EmployeePojo>();
		try {
			list = service.findEmployee(id);
		} catch (Exception e) {
			String exceptionMsg = "No such employee found";
			model.addAttribute("exceptionMsg", exceptionMsg);
			return "forward:/index.jsp";

		}

		model.addAttribute("employee", list);

		return "EmployeeData";
	}

	@RequestMapping(value = "/removeEmployee", method = RequestMethod.GET)
	public String removeEmployee(Model model, @RequestParam int id, @RequestParam String name) {

		List<EmployeePojo> list = new ArrayList<EmployeePojo>();
		try {
			list = service.removeEmployee(id, name);
		} catch (Exception e) {
			String exceptionMsg = "No such employee found";
			model.addAttribute("exceptionMsg2", exceptionMsg);
			return "forward:/index.jsp";

		}

		model.addAttribute("employee", list);

		return "EmployeeData";
	}

}
