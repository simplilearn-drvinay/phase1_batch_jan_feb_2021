package using_abstract_classes;

public class Main {

	public static void main(String[] args) {

		System.out.println("ACCESSING EMS USING SIMPLILEARN");
		EMS simpliEms = new SimplilearnEMS();
		simpliEms.createEmployee();
		simpliEms.calculateEmployeeSalary();
		simpliEms.updateEmployee();
		simpliEms.removeEmployee();
		simpliEms.commonEmpBenifits();
		simpliEms.getEmployeeByID();

		System.out.println("\n\nACCESSING EMS USING ABCEMP");
		EMS abcEms = new ABCEmployee();
		abcEms.createEmployee();
		abcEms.calculateEmployeeSalary();
		abcEms.updateEmployee();
		abcEms.removeEmployee();
		abcEms.commonEmpBenifits();
		abcEms.getEmployeeByID();
	}

}
