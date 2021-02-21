package using_abstract_classes;

public class ABCEmployee   extends EMS{

	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		System.out.println("ABCEMP CREATED AND SAVED IN MYSQL DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("ABCEMP UPDATED IN MYSQL DB");
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("ABCEMP REMOVED FROM MYSQL DB");
	}

	@Override
	public void getEmployeeByID() {
		// TODO Auto-generated method stub
		System.out.println("ABCEMP RETRIVED FROM MYSQL DB");	
	}

	@Override
	public void calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("ABCEMP SALARY CALCULATED FROM  MYSQL DB");
	}

}
