package employeeDataUsingAop;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
			String exceptionMsg = "DataBaseError";
			model.addAttribute("exceptionMsg", exceptionMsg);
			return "forward:/index.jsp";

		}

		model.addAttribute("employee", list);

		return "EmployeeData";

	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(ModelMap model, HttpServletRequest request) {

		String name = request.getParameter("name");
		String idString = request.getParameter("id");
		String salaryString = request.getParameter("salary");
		
		System.out.println(name  + idString + salaryString);

		int id = Integer.parseInt(idString);
		Double salary = Double.parseDouble(salaryString);

		try {
			service.addEmployee(id, name, salary);
		} catch (RuntimeException re) {
			String exceptionMsg = "Data Not Entered";
			model.addAttribute("exceptionMsg0", exceptionMsg);
		} catch (Exception e) {
			String exceptionMsg = "Employee Already Present";
			model.addAttribute("exceptionMsg0", exceptionMsg);
		}

		return "forward:/index.jsp";
	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String findEmployee(Model model, @RequestParam int id) {

		List<EmployeePojo> list = new ArrayList<EmployeePojo>();
		try {
			list = service.findEmployee(id);
		} catch (Exception e) {
			String exceptionMsg = "No such employee found";
			model.addAttribute("exceptionMsg1", exceptionMsg);
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
