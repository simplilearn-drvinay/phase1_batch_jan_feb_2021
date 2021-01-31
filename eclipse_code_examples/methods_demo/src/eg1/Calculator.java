package eg1;

public class Calculator {

	
	public int sum(int x,int y) {
		return x+y;
		
	}
	
	public static void sum(int a,int b,int c) {
		//return a+b+c;
		System.out.println("Res of sum(int,int,int) : "+(a+b+c));
	}
	
	public float sum(float a,float b) {
		return a+b;
	}
	
	public String getFullName(String fName,String lName) {
		return fName+" "+lName;
	}
	
	public boolean isEven(int n) {
		return (n%2==0);
	}
}
