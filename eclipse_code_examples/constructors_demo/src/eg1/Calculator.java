package eg1;

public class Calculator {
	
	private int x;
	private int y;
	
	/*
	 * Calculator(){}
	 * default no param empty constructor - by java compiler
	 * 
	 * this constructor will be taken off by the compiler whenever the 
	 * programmer creates one of his own.
	 */
	
	public Calculator(String name) {
		System.out.println("hello from constructor name is "+name);
	}
	
	public Calculator(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public int add() {
		return x+y;
	}

}
