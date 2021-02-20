package eg1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) {
		CreditCard cc=new CreditCard(1234567890123456L, "Dr Vinay N I", "RuPay", 123);
		System.out.println("Object to be serialized is : ");
		System.out.println(cc);
		//System.out.println(cc.toString());
		
	//	String s="kajsdhajskhdksajhdsakjd sakjdhdakjhaskjdhsakdhskajhd kjasdjsagkjdsfsjagfkjsagfkjsagf saf";
	//	System.out.println(s.hashCode());
		
	try(FileOutputStream fos=new FileOutputStream("serialize.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			){
		oos.writeObject(cc);
		System.out.println("Object serialized successfully");
	} catch (IOException e) {
		System.out.println(e);
	}

	}

}
