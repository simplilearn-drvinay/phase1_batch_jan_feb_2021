package using_interfaces;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ACCESSING IMPLEMENTOR USING INTERFACE1");
		MyInterface1 i1=new Implementor();
		i1.common();
		i1.method1();
		i1.method2();
		i1.method3();
		

		System.out.println("\n\nACCESSING IMPLEMENTOR USING INTERFACE2");
		MyInterface2 i2=new Implementor();
		i2.common();
		i2.int1();
		i2.int3();
		i2.int2();
		

	}

}
