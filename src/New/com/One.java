package New.com;

import java.util.Objects;

class Employee{
	private int empid;
	private String name;
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name);
		
	}

	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}
}
public class One {
	public static void main(String args[]) {
		Employee e1 = new Employee(1, "Vinayak");
		Employee e2 = new Employee(1, "Vinayak");
		
	
		if(e1.equals(e2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
