package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit { 

	public static void main(String[] args) {

		/*
		 * NOTE: 
		 * You should not change and should not need to change any of the code below.
		 * It's there just to make it easy for you to see and verify the accuracy of
		 * your answers.
		 */
		int[] perrins = new int[50];
		perrins[0] = 3;
		perrins[1] = 0;
		perrins[2] = 2;
		for (int i = 3; i < 50; ++i) {
			perrins[i] = perrins[i - 2] + perrins[i - 3];
		}

		boolean[] primeTrue = new boolean[50];
		int[] primeNums = new int[50];
		primeTrue[1] = false;
		for (int i = 0; i < 50; ++i) {
			int c = 2;
			primeNums[i] = i;
			int a = 1;

			while (c <= (int)Math.sqrt(50))
			{
				for (int j = 2; j < 50 / c ; ++j) {
					primeNums[c * j] = 0;
				}
				c = c + 1;
				a = a + 1;}
		}
		primeNums[49] = 0;
		for (int i = 0; i < 50; ++i) {
			if (primeNums[i] != 0) {
				primeTrue[primeNums[i]] = true;
			}
		}

		int termCount = 3;
		int sum = 5;
		while (sum <= 1000) {
			termCount = termCount + 1;
			sum = sum + perrins[termCount];
		}

		String[] primeString = new String[50];
		for (int i = 0; i < 50; ++i) {
			if (primeTrue[i] == false) {
				primeString[i] = i + " is NONPRIME.";
			}
			else if (primeTrue[i] == true) {
				primeString[i] = i + " is PRIME: " + perrins[i] + "%" + i + "==" + perrins[i]%i;
			}
		}

		// print all of the answers
		System.out.println("QUESTION 1 ");
		for (int i = 0; i < perrins.length; i++) {
			System.out.print( perrins[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// print the i's where the value is TRUE
		System.out.println("QUESTION 2 ");
		for (int i = 0; i < primeTrue.length; i++) {
			if (primeTrue[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("QUESTION 3: " + termCount);
		System.out.println();
		System.out.println();


		// print out all answers
		System.out.println("QUESTION 4 ");
		for (int i = 0; i < primeString.length; i++) {
			System.out.println(primeString[i]);
		}



	}
}


