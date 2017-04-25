package StringTheory;

public class StringTheory {
	
	public static int scraper(String s) {
		int n1 = 0; 
		int n2 = 0;
		char[] sChars = new char[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			sChars[i] = s.charAt(i);
		}
		String sFormat = "";
		for (int i = 0; i < sChars.length; ++i) {
			if (!Character.isWhitespace(sChars[i])) {
				sFormat += Character.toString(sChars[i]);
			}
		}
		char operator = s.charAt(0);
		for (int i = 0; i < sFormat.length(); ++i) {
			if (!Character.isDigit(sFormat.charAt(i))) {
				operator = sFormat.charAt(i);
			}
		}
		String s1 = "";
		String s2 = "";
		for (int i = 0; sFormat.charAt(i) != operator; ++i) {
			s1 += Character.toString(sFormat.charAt(i));
		}
		int opIndex = sFormat.indexOf(operator);
		for (int i = opIndex + 1; i < sFormat.length(); ++i) {
			s2 += Character.toString(sFormat.charAt(i));
		}
		char[] ops = new char[] {'+','-','*','/'};
		n1 = Integer.parseInt(s1);
		n2 = Integer.parseInt(s2);
		if (operator == ops[0]) {
			return n1+n2;
		}
		if (operator == ops[1]) {
			return n1-n2;
		}
		if (operator == ops[2]) {
			return n1*n2;
		}
		else {
			return n1/n2;
		}
		
	}

	public static void main(String[] args) {
		String s = "25 *30";
		
		System.out.println(scraper(s));
	}

}
