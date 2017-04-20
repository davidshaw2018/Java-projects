package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if (n > 1) {
			return recursive(n-1) + recursive(n-2);
		}
		else return n;
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		int ans = 0;
		int n1 = 1;
		int n2 = 1;
		for (int i = 0; i < n; ++i) {
			ans = n1;
			n1 = n2;
			n2 = ans + n1;
		}
		return ans;
	}

}
