package demo;

public class EmployeePojo {

		String name;
		Integer id;
		Double salary;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public EmployeePojo(String name, Integer id, Double salary) {
			super();
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

	/*	@Override
		public String toString() {
			return "[name=" + name + ", id=" + id + ", salary=" + salary + "]";
		}
*/
	

	
}
