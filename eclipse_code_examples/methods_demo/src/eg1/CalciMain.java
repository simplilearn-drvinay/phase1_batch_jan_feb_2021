package eg1;

public class CalciMain {

	public static void main(String[] args) {
		int a=100;
		int b=777;
		
		Calculator c1=new Calculator();
		int res=c1.sum(a, b);// call by value or pass by value
		System.out.println("res of sum(int,int) = "+res);
		
		Calculator.sum(1229, b, a);
		
		
		System.out.println("res of sum(float,float) : "+c1.sum(12.33f, 3333.45f));
		
		String firstName="Dr Vinay";
		String lastName ="Ingalahalli";
		
		//Pass by reference or call by reference
		System.out.println("Fullname is "+c1.getFullName(firstName, lastName));
		int n=22;
		if(c1.isEven(n)) {
			System.out.println("YES "+n+" is even");
		}else {
			System.out.println("NO "+n+" is odd");
		}
	}

}
