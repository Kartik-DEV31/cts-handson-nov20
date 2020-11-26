package employeeMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMenuMain {

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String... strings) {

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String choice = null;
		int n = 0;
		EmployeeService service = new EmployeeServiceImpl();
		List<Employee> list = new ArrayList<Employee>();

		do {
			System.out.println("1: Add Employee");
			System.out.println("2: Find by ID");
			System.out.println("3: Display all Employees");
			System.out.println("4: Sort the Employees by Id");
			System.out.println("5: Sort the Employees by Name");
			System.out.println("6: Sort the Employees by Salary");

			System.out.print("---Enter your Choice : ");

			n = scan.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter ID : ");
				Integer id = scan.nextInt();

				System.out.print("Enter name : ");
				String name = scan2.nextLine();

				System.out.print("Enter Salary : ");
				Double salary = scan.nextDouble();

				System.out.print("Enter DOB (in dd-MM-yyyy) : ");
				String dob = scan2.nextLine();
				service.add(id, dob, name, salary);
				break;
			case 2:
				System.out.print("Enter the id : ");
				Integer fId = scan.nextInt();
				list = service.findEmployeeById(fId);
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 3:
				list = service.getEmployees();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 4:
				list = service.getSortedEmployeesById();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;
			case 5:
				list = service.getSortedEmployeesByName();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 6:
				list = service.getSortedEmployeesBySalary();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			default:
				System.out.println("---Wrong Input Entered Try again.---");
				break;
			}
			System.out.print("---Want to continue (y or n) :---");
			choice = scan2.nextLine().toLowerCase();

		} while (choice.equals("y"));

		System.out.println("---Thankyou for using application...---");

	}

}
