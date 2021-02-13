package eg1;

public class PanCardValidation {

	public static void main(String[] args) {
		/*
		 * PAN - Permanent Account Number Format -Total length of 10 chars - first 5
		 * positions are Uppercase letters -next 4 positions are followed with digits
		 * -last positions is an uppercase letter again eg for valid PAN numbers be like
		 * - AXDEF4545L, KIRAY8711P
		 */
		String s = "ABFGH4149U";
		boolean b = false;
		if (s.length() == 10 && Character.isUpperCase(s.charAt(9))) {
			int upper = 0;
			for (int i = 0; i < 5; i++) {
				if (Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
			}
			if (upper == 5) {
				int digits = 0;
				for (int i = 5; i < 9; i++) {
					if (Character.isDigit(s.charAt(i))) {
						digits++;
					}
				}
				if (digits == 4) {
					b = true;
				}
			}
		}

		if (b) {
			System.out.println(s + " is a Valid PAN number");
		} else {
			System.out.println(s + " is a INVALID PAN number");
		}

	}

}
