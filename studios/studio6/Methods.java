package studio6;

public class Methods {

	// Your methods go below this line
	/**
	 * 
	 * @param int n
	 * @return n*(n-1)*(n-2)*....*2*1
	 */
	public static int fact(int n) {
		if (n > 0) {
			return n * fact(n-1);
		}
		else return 1;
	}
	/**
	 * 
	 * @param int n
	 * @return 1,1,2,3,5,8, ... 
	 */
	public static int fib(int n) {
		if (n > 1) {
			return fib(n-1) + fib(n-2);
		}
		else return n;
	}
	/**
	 * 
	 * @param int n
	 * @return true if n is odd, false if n is even
	 */
	public static boolean isOdd(int n) {
		if (n>0){
			return !isOdd (n-1);
		}
		else {
			return false;
		}
	}
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a+b
	 */
	public static int sum(int a, int b) {
		if (b > 0) {
			return sum(a+1, b-1);
		}
		else return a;
	}
	/**
	 * 
	 * @param int n
	 * @return n + (n-2) + (n-4) + ... + 1 if n odd, or 0 if n even
	 */
	public static int sumDownBy2 (int n) {
		if 	(n>1){
			return n + sumDownBy2 (n-2);
		}
		else{
			return n;	
		}
	}
	/**
	 * 
	 * @param int n
	 * @return 1/n + 1/(n-1) + ... + 1/2 + 1
	 */
	public static double harmonicSum (int n) {
		if 	(n>1){
			return  ((1.0/n) + harmonicSum(n-1));
		}
		else{
			return 1;	
		}
	}
	/**
	 * 
	 * @param int a
	 * @param int b
	 * @return a*b
	 */
	public static int mult(int a, int b) {
		if (b > 0) {
			return a + mult(a, b-1);
		}
		else return 0;
	}

}
