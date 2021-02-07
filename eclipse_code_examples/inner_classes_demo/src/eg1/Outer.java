package eg1;

public  class Outer {
	//Inner classes can be static and non static, and they can have any access modifier
	//If static inner class then you can have both static as well as non static methods in it
	// A non static inner class can have only non static methods in it.
	
	public void outerMethod() {
		System.out.println("Hello from outerMethod() accessing innerprivate with outermethod");
		InnerPrivate i=new InnerPrivate();
		i.innerPrivateMethod();
	}
	
	private class InnerPrivate{
		public void innerPrivateMethod() {
			System.out.println("Hello from innerPrivateMethod() of InnerPrivate class");
		}
		class InnerInner{
			
		}
	}
	
	protected class InnerProtected{
		
	}
	
	public class InnerPublic{
		public void innerPublicMethod1() {
			System.out.println("hello from InnerPublic class's innerPublicMethod1()");
		}
		public  void innerPublicMethod2() {
			System.out.println("hello from InnerPublic class's innerPublicMethod2()");
		}
	}
	
	public static class InnerPublicStatic{
		public  void innerPublicNonStaticMethod() {
			System.out.println("hello from InnerPublicStatic class's innerPublicNonStaticMethod()");
		}
		public static void innerPublicStaticMethod() {
			System.out.println("Hello from InnerPublicStatic class's static method");
		}
	}

}

 class A{
	
}
 
 class B{
		
 }
 
 class C{
		
 }