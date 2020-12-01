package employeeDataUsingAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl implements AspectInterface {

	@After("execution(public * employeeDataUsingAop.EmployeeController.testMethod(..))")
	@Override
	public void testDataLog() {

		System.out.println("Test Successful");

	}

	@Override
	@After("execution( * employeeDataUsingAop.EmployeeService.findAllEmployee())")
	public void findAllEmployee() {
		System.out.println("All EmployeeData Retrieved");

	}

	@Override
	@After("execution( * employeeDataUsingAop.EmployeeService.findEmployee(int))")
	public void findEmployee() {
		System.out.println("EmployeeData Retrieved");

	}

	@Override
	@After("execution( * employeeDataUsingAop.EmployeeService.findEmployee(int,String))")
	public void removeEmployee() {
		System.out.println("EmployeeData Retrieved");

	}

}
