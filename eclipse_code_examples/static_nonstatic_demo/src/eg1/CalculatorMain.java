package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
		helloStatic();
		
		Calculator.helloStatic();
		
		Calculator c=new Calculator();
		c.helloNonStatic();
		
		CalculatorMain cm=new CalculatorMain();
		cm.helloNonStatic();
		
		final int x=100;
		//x=99;
		System.out.println("x = "+x);
		
		System.out.println("P = "+Calculator.P);
		
		//static final variables will be in uppercase.
		System.out.println("PI = "+Math.PI);
		System.out.println("Max Integer Value = "+Integer.MAX_VALUE);
		System.out.println("Max Long Value = "+Long.MAX_VALUE);

	}
	
	public static void helloStatic() {
		System.out.println("Hello from helloStatic() from CalculatorMain");
	}
	
	public void helloNonStatic() {
		System.out.println("Hello from helloNonStatic() of CalculatorMain");
	}

}
