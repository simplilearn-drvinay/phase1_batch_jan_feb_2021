package eg1;

public class RegexPanDemo {

	public static void main(String[] args) {
		/*
		 * Regular Expression(Reg-ex)
		 * 
		 * [] - expression
		 * {} - length
		 * ^ - not
		 * [a-z]{5} - any word of length 5 but should be a lowercase word
		 * [0-9]{3} - any number of length 3
		 * [a-zA-Z]{4,8} - any word of min length 4 and max length 8
		 * [0-9]{1,} - min 1digit and max can be any
		 * [^a-zA-Z] - apart from alphabets everything else is accepted
		 */
		String s = "ABFGH4149Q";
		if (s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println(s + " is a Valid PAN number");
		} else {
			System.out.println(s + " is a INVALID PAN number");
		}
		
		
		String x="!@#1   ADFFSfjkdhsfk 231A$'2  L3";
		System.out.println(x.replaceAll("[^A-Za-z]", ""));
		System.out.println(x.replaceAll("[^A-Za-z]", "").length());
		System.out.println(x.replaceAll("[^a-z]", ""));
		System.out.println(x.replaceAll("[^0-9]", ""));
		System.out.println(x.replaceAll("[ 0-9A-Za-z]", ""));
	}
//Explore more on regex - (),+ .,* - assignment
}
