package eg_custom_exception;

public class ValidatorMain {

	public static void main(String[] args) {
		
		
		Validator v=new Validator();
		
		try {
			if(v.isValidMobileNumber("+1-1112222222")) {
				System.out.println("Mobile number validated");
			}
		} catch (InvalidMobileNumberException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidPanNumber("ABCEE1900A")) {
			System.out.println("Pan validated");
		}
		}catch(InvalidPanNumberException e) {
			System.out.println(e.getMessage());
		}

	}

}
