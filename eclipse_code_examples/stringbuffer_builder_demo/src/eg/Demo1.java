package eg;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" hey");
		System.out.println(sb);
		sb.append(true).append("upper").append(123111).append(9090);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.insert(1, "JAVA");
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		
		
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("JavaSE");
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
	}

}
