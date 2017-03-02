package calculator;

public class Computations {

	/**
	 * Create the static methods as described on the 
	 * description for this assignment.
	 */
	
	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return sum of a and b
	 */
	public static double addDoubles(double a, double b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return a-b
	 */
	public static double subtractDoubles(double a, double b) {
		return a - b;
	}

	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return a/b, or 0 if b=0
	 */
	public static double divideDoubles(double a, double b) {
		if (b == 0.0) {
			return 0;
		}
		else return a/b;
	}
	
	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return a*b
	 */
	public static double multiplyDoubles(double a, double b) {
		return a*b;
	}
	
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a+b
	 */
	public static int addInts(int a, int b) {
		return a+b;
	}
	
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a-b
	 */
	public static int subtractInts(int a, int b) {
		return a-b;
	}
	
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a/b, or 0 if b=0
	 */
	public static int divideInts(int a, int b) {
		if (b == 0) {
			return 0;
		}
		else return a/b;
	}
	
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a*b
	 */
	public static int multiplyInts(int a, int b) {
		return a*b;
	}
	/**
	 * 
	 * @param string a
	 * @param string b
	 * @return a+b
	 */
	public static String concatenate(String a, String b) {
		return a+b;
	}
	/**
	 * 
	 * @param boolean a
	 * @param boolean b
	 * @return a and b
	 */
	public static boolean andBoolean(boolean a, boolean b) {
		return a&&b;
	}
	/**
	 * 
	 * @param boolean a
	 * @param boolean b
	 * @return a or b
	 */
	public static boolean orBoolean(boolean a, boolean b) {
		return a||b;
	}
	/**
	 * 
	 * @param int a
	 * @return a as a double
	 */
	public static double intToDouble(int a) {
		return (double)a;
	}
	/**
	 * 
	 * @param double a
	 * @return a as an integer
	 */
	public static int doubleToInt(double a) {
		return (int)a;
	}
	/**
	 * 
	 * @param string s
	 * @return an error
	 */
	public static double stringToDouble(String s) {
		throw new UnsupportedOperationException(); 
	}
	/**
	 * 
	 * @param boolean a
	 * @return a as a string
	 */
	public static String booleanToString(boolean a) {
		return "" + a;
	}
	/**
	 * 
	 * @param boolean a
	 * @return a
	 */
	public static boolean booleanToBoolean(boolean a) {
		return a;
	}
	/**
	 * 
	 * @param double a
	 * @return a as a double
	 */
	public static String doubleToString(double a) {
		return "" + a;
	}
	/**
	 * 
	 * @param boolean a
	 * @return an error
	 */
	
	public static int booleanToInt(boolean a) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param string s
	 * @return error
	 */
	public static int stringToInt(String s) {
		throw new UnsupportedOperationException();
	}
	
	public static boolean stringToBoolean(String s) {
		throw new UnsupportedOperationException();
	}
	
	public static boolean intToBoolean(int a) {
		throw new UnsupportedOperationException();
	}
	
	public static double booleanToDouble(boolean a) {
		throw new UnsupportedOperationException();
	}
	public static String stringToString(String s) {
		return s;
	}
	public static String intToString(int n) {
		return "" + n;
	}
	public static int intToInt(int n) {
		return n;
	}
	public static boolean doubleToBoolean(double n) {
		throw new UnsupportedOperationException();
	}
	public static double doubleToDouble(double n) {
		return n;
	}
}
