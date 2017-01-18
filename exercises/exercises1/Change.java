package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int numPennies = ap.nextInt("Number of pennies?");
		int numDollars = numPennies / 100;
		int numCents = numPennies % 100; 
		int numQuarters = numCents / 25;
		numCents = numCents % 25;
		int numDimes = numCents / 10;
		numCents = numCents % 10;
		int numNickels = numCents / 5;
		numCents = numCents % 5;
		
		System.out.println("For " + numPennies + " you have " + numDollars + " dollars, "
				+ numQuarters + " quarters, " + numDimes + " dimes, "
				 + numNickels + " nickels, and " + numCents + " pennies");
		
	}

}
