package eg2;

public class Employee extends Person {

	private String designation;
	private String organization;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", organization=" + organization + ", salary=" + salary
				+ ", toString()=" + super.toString() + "]";
	}
	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getOrganization() {
		return organization;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee(int id, String name, int age, String designation, String organization, double salary) {
		super(id, name, age);
		this.designation = designation;
		this.organization = organization;
		this.salary = salary;
	}
	
	
}
