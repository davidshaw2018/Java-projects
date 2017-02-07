package lab3;

import java.util.Arrays;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int numDice = ap.nextInt("How many dice are we using?");
		int numThrows = ap.nextInt("How many throws will you make?");
		int[] diceThrown = new int[numDice];
		int j = 0;
		int numSame = 0;
		int[] diceSum = new int[5 * numDice + 1];
		

		while (j < numThrows) {
			int firstRoll = -1;
			boolean allSame = true;
			int sum = 0;
			for (int i = 0; i < numDice; ++i) {
				int v = 0;
				if ((6 * Math.random()) < 1) {
					v = 1;
				} else if ((6 * Math.random()) < 2) {
					v = 2;
				} else if ((6 * Math.random()) < 3) {
					v = 3;
				} else if ((6 * Math.random()) < 4) {
					v = 4;
				} else if ((6 * Math.random()) < 5) {
					v = 5;
				} else {
					v = 6;
				}
				diceThrown[i] = v;
				if (i == 0) {
					firstRoll = v;
				} else {
					if (v != firstRoll) {
						allSame = false;
					}
				}
				sum = sum + diceThrown[i];
				System.out.print(diceThrown[i] + "    ");

			}
			System.out.print(sum + " ");

			if (allSame) {
				numSame++;
				System.out.print("all same ");
			}
			j = j + 1;
			System.out.println("");
			for (int k = numDice; k <= 6 * numDice; ++k) {
				if (k == sum) {
					diceSum[k - numDice] = diceSum[k - numDice] + 1;
				}

			}


		}
		System.out.println("");
		for (int a = 0; a < diceSum.length; ++a) {
			System.out.println("The number of " + (a + numDice) + "s is " + diceSum[a]);
		}
		double percentSame = (double)Math.round(10000 * (double) (numSame) / (double) numThrows) / 100;
		System.out.println("");
		System.out.println("The number of identical rolls is " + numSame);
		System.out.println("The percentage of identical rolls is " + percentSame);
	}
}
