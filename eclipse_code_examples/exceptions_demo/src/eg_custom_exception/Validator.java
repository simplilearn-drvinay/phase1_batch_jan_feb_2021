package eg_custom_exception;

public class Validator {

	
	public boolean isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
		
		if(mobileNumber==null || mobileNumber.equals("")) {
			throw new InvalidMobileNumberException("Mobile number cannot be empty");
		}
		
		if(!mobileNumber.matches("\\+1-[0-9]{10}")) {
			throw new InvalidMobileNumberException("Entered mobilenumber : "+mobileNumber+" is invalid");
		}
		return true;
	}
	
	
	public boolean isValidPanNumber(String pan) {
		if(pan==null || pan.equals("")) {
			throw new InvalidPanNumberException("Pan number cannot be empty");
		}
		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			throw new InvalidPanNumberException("Entered Pan number "+pan+" is invalid");
		}
		return true;
	}
}
