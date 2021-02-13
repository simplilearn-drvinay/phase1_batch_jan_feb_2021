package eg;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam1";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String t=sb.toString();
		if(s.equals(t)) {
			System.out.println("Yes Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		
		int x=21212;
		//String p="racecar123";
		String p=x+"";
		if(new StringBuffer(p).reverse().toString().equals(p)) {
			System.out.println("Yes it is ");
		}else {
			System.out.println("No it is not");
		}

	}

}
