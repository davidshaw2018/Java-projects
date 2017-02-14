package exam1;
public class ExamTemplate {

	public static int[] question1() {
		// feel free to modify the declaration of answer as necessary
		int[] perrins = new int[50];
		perrins[0] = 3;
		perrins[1] = 0;
		perrins[2] = 2;
		for (int i = 3; i < 50; ++i) {
			perrins[i] = perrins[i - 2] + perrins[i - 3];
		}

		// don't change the return statement
		return perrins;
	}

	public static boolean[] question2() {
		// feel free to modify the declaration of answer as necessary
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
		for (int i = 0; i < 50; ++i) {
			if (primeNums[i] != 0) {
				primeTrue[primeNums[i]] = true;
			}
		}



		// don't change the return statement
		return primeTrue;
	}

	public static int question3() {
		// feel free to modify the declaration of answer as necessary
		int sum = 5;
		int termCount = 3;
		int[] perrins = new int[50];
		perrins[0] = 3;
		perrins[1] = 0;
		perrins[2] = 2;
		for (int i = 3; i < 50; ++i) {
			perrins[i] = perrins[i - 2] + perrins[i - 3];
		}
		int i = 3;
		while (sum <= 1000) {
			termCount = termCount + 1;
			sum = sum + perrins[i];
			i = i + 1;
		}

		// you may want to use your answer from question 1 in answering this question
		int[] question1Answer = question1();

		// don't change the return statement
		return termCount;
	}

	public static String[] question4() {
		// feel free to modify the declaration of answer as necessary
		String[] primeString = new String[0];

		// you may want to use your answer from questions 1 and 2 in answering this question
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
		for (int i = 0; i < 50; ++i) {
			if (primeNums[i] != 0) {
				primeTrue[primeNums[i]] = true;
			}
		}

		for (int i = 0; i < 50; ++i) {
			if (primeTrue[i] == false) {
				primeString[i] = i + " is NONPRIME.";
			}
			else if (primeTrue[i] == true) {
				primeString[i] = i + " is PRIME: " + perrins[i] + "%" + i + "==" + perrins[i]%i;
			}
		}

		// don't change the return statement
		return primeString;
	}

	public static void main(String[] args) {
		/*
		 * NOTE: 
		 * You should not change and should not need to change any of the code below.
		 * It's there just to make it easy for you to see and verify the accuracy of
		 * your answers.
		 */
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		int question3Answer = question3();
		String[] question4Answer = question4();

		// print all of the answers
		System.out.println("QUESTION 1 ");
		for (int i = 0; i < question1Answer.length; i++) {
			System.out.print( question1Answer[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// print the i's where the value is TRUE
		System.out.println("QUESTION 2 ");
		for (int i = 0; i < question2Answer.length; i++) {
			if (question2Answer[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("QUESTION 3: " + question3Answer);
		System.out.println();
		System.out.println();


		// print out all answers
		System.out.println("QUESTION 4 ");
		for (int i = 0; i < question4Answer.length; i++) {
			System.out.println(question4Answer[i]);
		}

	}

}