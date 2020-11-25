package javaMaps;

public class Student {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return   name ;
	}


	

}
