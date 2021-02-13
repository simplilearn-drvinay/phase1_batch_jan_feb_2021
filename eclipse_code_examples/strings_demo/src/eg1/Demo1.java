package eg1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4="hey";
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));
		System.out.println("s1==s4 "+(s1==s4));
		
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		
		System.out.println("s1.equals(\"HellO\") : "+s1.equals("HellO"));
		System.out.println("s1.equalsIgnoreCase(\"HellO\") : "+s1.equalsIgnoreCase("HellO"));
		
		System.out.println("s1.length() : "+s1.length());
		System.out.println("s1.charAt(0) : "+s1.charAt(0));
		
		char ar[]=s1.toCharArray();
		System.out.println(Arrays.toString(ar));
		
		System.out.println("s1.toUpperCase() : "+s1.toUpperCase());
		System.out.println("s1 : "+s1);
		System.out.println("s1.contains(\"el\") : "+s1.contains("el"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		System.out.println("s1.substring(1,4) : "+s1.substring(1,4));
		
		
		String s5="       hrllooo         ";
		System.out.println("s5 : "+s5);
		s5=s5.trim();
		System.out.println("s5  after trim : "+s5);
		
		String s6="are we understanding string common pool?";
		String ar1[]=s6.split(" ");	
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}

	}

}
