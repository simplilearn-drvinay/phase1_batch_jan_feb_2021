package eg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeMain {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis=new FileInputStream("serialize.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Object deserialized is");
			System.out.println(cc);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
