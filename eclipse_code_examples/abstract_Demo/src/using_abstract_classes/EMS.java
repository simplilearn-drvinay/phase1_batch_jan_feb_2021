package using_abstract_classes;

public abstract class EMS {

	public abstract void createEmployee();
	public void commonEmpBenifits() {
		System.out.println("COMMON EMP BENEFITS");
	}
	public abstract void updateEmployee();
	public abstract void removeEmployee();
	public abstract void getEmployeeByID();
	public abstract void calculateEmployeeSalary();
}
