package exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {
		return nConcat(s, 2);
	}
	
	public static String nConcat(String s, int n) {
		String total = "";
		
		for (int i = 0; i < n; ++i) {
			total = total + s;
		}
		return total;
	}
	
	
			
		
		
	
	
	
	
	public static void main(String[] args) {
		
		//
		// Testing the methods
		//
		System.out.println(selfConcat("hello"));
	}

}
