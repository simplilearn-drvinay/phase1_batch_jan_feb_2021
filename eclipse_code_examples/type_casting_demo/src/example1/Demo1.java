package example1;

public class Demo1 {

	public static void main(String[] args) {
		
		/*
		 * 8 primitive data types
		 * ----------------------------
		 * 
		 * typename		size(bytes)		defaultValues
		 * -------------------------------------------------
		 * Number Family
		 * byte			1byte				0
		 * short		2					0
		 * int			4					0
		 * long			8					0
		 * 
		 * Decimal Family
		 * float		4					0.0000f
		 * double		8					0.0000d(java takes any decimal values by default as double)
		 * 
		 * char			2					'\u000000'(java supports UNI-Code Character set)
		 * 
		 * boolean		1bit				false
		 * 
		 * 
		 * 
		 * implicit -> compiler -> assign smaller in size to larger in size
		 * explicit ->done by developer -> we as developers we should explicitly say to the compiler to covert it to the respective type-> larger size to smaller ones
		 */
		
		
		//Implicit Casting
		System.out.println("Implicit Demo");
		int x=100;
		System.out.println("x = "+x);
		double d=x; //Implicit
		System.out.println("d = "+d);
		
		long l=x; //implicit
		System.out.println("l = "+l);
		
		float f=l; //implicit
		System.out.println("f = "+f);
		f=99.8888f;
		d=f; //implicit
		System.out.println("d = "+d);
		
		System.out.println("\n\nExplicit Demo");
		double d1=98.77;
		System.out.println("d1 = "+d1);
		int z=(int)d1;//explicit
		System.out.println("z = "+z);
		float f2=77.66f;//explicit
		System.out.println("f2 = "+f2);
		long m=(long)f2;//explicit
		System.out.println("m = "+m);
		
		
		System.out.println("\n\nCasting Demo for char");
		char c='A';
		int g=c;  //Implicit
		System.out.println("c = "+c);
		System.out.println("g = "+g);
		g=100;
		c=(char) g;//explicit
		System.out.println("c = "+c);
		System.out.println("g = "+g);
		
		
		int o=9999;
		System.out.println("o = "+o);
		
		long l3=9234567890L;
		System.out.println("l3 -> "+l3);
		
	}

}
