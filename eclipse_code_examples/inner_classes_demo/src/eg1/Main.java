package eg1;



public class Main {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerMethod();
		
		Outer.InnerPublic i=o.new InnerPublic();
		i.innerPublicMethod1();
		i.innerPublicMethod2();
		
		Outer.InnerPublicStatic.innerPublicStaticMethod();
		
		Outer.InnerPublicStatic i2=new Outer.InnerPublicStatic();
		i2.innerPublicNonStaticMethod();

	}

}
