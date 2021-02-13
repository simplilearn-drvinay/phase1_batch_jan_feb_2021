package eg1;

public class CharacterClassDemo {

	public static void main(String[] args) {
		String s="!@#1   ADFFSfjkdhsfk 231A$'2  L3";
		
		int alpha=0,upper=0,lower=0,digit=0,alphanum=0,spaces=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				spaces++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
			
		}
		System.out.println("Total alpha count : "+alpha);
		System.out.println("Total upper alpha count : "+upper);
		System.out.println("Total lower alpha count : "+lower);
		System.out.println("Total digit count : "+digit);
		System.out.println("Total alphanumeric count : "+alphanum);
		System.out.println("Total spaces count : "+spaces);
		System.out.println("Total special char count : "+special);
	}
}
