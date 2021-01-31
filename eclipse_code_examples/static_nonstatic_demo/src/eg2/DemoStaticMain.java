package eg2;

public class DemoStaticMain {
	
	int x; //global instance(object) level variable
	int y;
	static int z; //global class level variable

	public static void main(String[] args) {   //static method are termed to  be as class level access
		DemoStaticMain d1=new DemoStaticMain();
		d1.x=100;
		d1.y=88;
		z=10000000;
		System.out.println("Printing d1");
		d1.printXYZ();
		
		DemoStaticMain d2=new DemoStaticMain();
		System.out.println("\nPrinting d2");
		d2.printXYZ();
		z=1;
		
		
		System.out.println("\nPrinting d2 again");
		d2.printXYZ();
		
		
		System.out.println("\nPrinting d1 again");
		d1.printXYZ();

	}
	
	public void printXYZ() {  //non static methods are termed as object level access.
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}

}
