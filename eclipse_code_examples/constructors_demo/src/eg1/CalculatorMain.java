package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
	
		
		Calculator c=new Calculator("Vinay");
		
		
		Calculator c1=new Calculator(122, 2222);
		System.out.println("Res of add() using c1 is : "+c1.add());
		
		
		System.out.println("Res of add() using c is : "+c.add());
		
	}

}
