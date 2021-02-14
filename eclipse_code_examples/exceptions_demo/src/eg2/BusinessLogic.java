package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BusinessLogic {

	
	
	public void openFile(String fileName) throws FileNotFoundException,NullPointerException {
		FileInputStream fis=new FileInputStream(fileName);
	}
	
	
	public boolean isValidAge(int age) throws RuntimeException {
		
		if(age<=0) {
			throw new RuntimeException("Age cannot be -ve or zero");
		}
		
		if(age<18 || age >40) {
			throw new RuntimeException("Only users with age between 18 and 40 are accepted here");
		}
		
		return true;
	}
}
