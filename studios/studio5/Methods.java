package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		int sum = 0;
		for (int i = 0; i < x; ++i) {
			sum = sum + y;
		}
		return sum;  
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return average of a, b, and c
	 */
	
	public static double avg3(int a, int b, int c) {
		return (double)(a + b + c) / 3.0;
	}
	
	/**
	 * 
	 * @param An array of doubles
	 * @return each array index summed together
	 */
	
	public static double sumArray(double[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; ++i) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * @param an array of doubles
	 * @return average value of the array
	 */
	
	public static double average(double[] array) {
		return sumArray(array) / array.length;
	}
	
	/**
	 * 
	 * @param the original number x
	 * @param the number to be subtracted y
	 * @return the difference
	 */
	
	public static int subtraction(int x, int y) {
		return x - y;
	}
	
	/**
	 * 
	 * @param A string
	 * @return The inverted pig latin string
	 */
	
	public static String pig(String s) {
		return s.substring(1) + s.substring(0, 1) + "ay";
	}

}
