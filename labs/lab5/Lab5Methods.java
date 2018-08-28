package lab5;

public class Lab5Methods {
	/**
	 * 
	 * @param n
	 * @return n + (n-2) + (n-4) + ... + 1, if n odd, or 2, if n even
	 */
	public static int sumDownBy2(int n) {
		if (n < 1) {
			return 0;
		}
		int sum = 0; 
		while (n > 0) {
			sum = sum + n;
			n = n - 2;
		}
		return sum;
	}
	/**
	 * 
	 * @param n
	 * @return 1/2 + 1/3 + ... + 1/n
	 */
	public static double harmonicSum(int n) {
		double sum = 0.0;
		while (n > 0) {
			sum = sum + 1.0/n;
			n = n - 1;
		}
		return sum;
	}

	/** 
	 * 
	 * @param k
	 * @return 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
	 */
	public static double geometricSum(int k) {
		double sum = 0.0;
		while (k >= 0) {
			sum = sum + 1.0/Math.pow(2, k);
			k -= 1;
		}
		return sum;
	}
	/**
	 * 
	 * @param j > 0
	 * @param k > 0
	 * @return j*k
	 */
	public static int multPos(int j, int k) {
		int sum = 0;
		for (int i = 0; i < j; ++i) {
			sum = sum + k;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param j
	 * @param k
	 * @return j*k
	 */
	public static int mult(int j, int k) {
		int sum = multPos(Math.abs(j), Math.abs(k));
		if (j < 0 && k < 0) {
			return sum;
		}
		else if (j > 0 && k > 0) {
			return sum;
		}
		else return -sum;
	}
	/** 
	 * 
	 * @param n
	 * @param k
	 * @return n^k
	 */
	public static int expt(int n, int k) {
		int sum = 1;
		for (int i = 0; i < k; ++i) {
			sum = n * sum;
		}
		return sum;
		
	}
	
	
	
}
