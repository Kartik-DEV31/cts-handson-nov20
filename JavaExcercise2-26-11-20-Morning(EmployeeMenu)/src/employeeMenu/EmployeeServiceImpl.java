package employeeMenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

	
	List<Employee> list = new ArrayList<Employee>();
	
	
	@Override
	public void add(Integer id, String dob, String name, Double salary) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(dob,formatter);
		list.add(new Employee(id, date, name, salary));
		
		
		
	}

	@Override
	public List findEmployeeById(Integer id) {
		List<Employee> list2 = new ArrayList<Employee>();
		
		
		
		for(int i =0;i<list.size();i++)
		{
			if(list.get(i).getId()==id)
			{
				list2.add(list.get(i));
			}
			
		}
		return list2;
		
		
	}

	@Override
	public List getEmployees() {

		
		return list;	
	}

	@Override
	public List getSortedEmployeesById() {
		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
			
			
		};
		
		Collections.sort(list, c);
		return list;
		
	}

	@Override
	public List getSortedEmployeesBySalary() {
	
		Collections.sort(list, (e1,e2) -> e1.getSalary().compareTo(e2.getSalary()) );
		return list;
	}

	@Override
	public List getSortedEmployeesByName() {
		Collections.sort(list, (e1,e2) -> e1.getName().compareTo(e2.getName()) );
		return list;

	}

}
