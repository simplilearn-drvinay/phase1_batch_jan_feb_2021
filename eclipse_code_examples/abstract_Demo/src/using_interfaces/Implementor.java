package using_interfaces;

public class Implementor implements MyInterface1,MyInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("METHOD1 FROM MYINTERFACE1 VALUE OF X = "+MyInterface1.x);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("METHOD2 FROM MYINTERFACE1 VALUE OF X = "+MyInterface1.x);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("METHOD3 FROM MYINTERFACE1 VALUE OF X = "+MyInterface1.x);
	}

	@Override
	public void int1() {
		// TODO Auto-generated method stub
		System.out.println("int1 FROM MYINTERFACE2 X = "+MyInterface2.x);
	}

	@Override
	public void int2() {
		// TODO Auto-generated method stub
		System.out.println("int2 FROM MYINTERFACE2");	
	}

	@Override
	public void int3() {
		// TODO Auto-generated method stub
		System.out.println("int3 FROM MYINTERFACE2");
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("THIS METHOD IS COMMON FOR BOTH THE INTERFACES");
	}

}
