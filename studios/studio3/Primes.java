package studio3;

import cse131.ArgsProcessor;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("What is the size of the array?");
		int[] primes = new int[n];

		for (int i = 0; i < n; ++i) {
			int c = 2;
			primes[i] = i;
			int a = 1;

			while (c <= (int)Math.sqrt(n))
			{
				for (int j = 2; j < n / c ; ++j) {
					primes[c * j] = 0;
				}
				c = c + 1;
				a = a + 1;}


			System.out.println(primes[i]);


		}


	}

}
