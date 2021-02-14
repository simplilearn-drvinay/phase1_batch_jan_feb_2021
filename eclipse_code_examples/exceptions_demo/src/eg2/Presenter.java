package eg2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessLogic b=new BusinessLogic();
		try {
			b.openFile("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(b.isValidAge(41)) {
			System.out.println("Age Validated");
		}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
