package eg1;

public class MobileNumberValidation {

	public static void main(String[] args) {
		String s = "+1-9087654329";
		if (s.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

	}

}
//Assignment - Validate all your Id proofs(SSN,DL,passportnumber) you have using regex
