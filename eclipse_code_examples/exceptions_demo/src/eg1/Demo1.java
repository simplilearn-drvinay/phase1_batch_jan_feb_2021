package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=2;
		
		int res=0;
		
		try {
		res=x/y;
		
		String s=null;
		System.out.println(s.length());
		System.out.println(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}catch(NullPointerException e) {
			System.out.println("Something is null");
		}finally {
			System.out.println("Result is "+res);
		}
		
		//Thread.sleep(1000);
		//System.out.println(args[0]);
		System.out.println("Other LOC");

	}

}
