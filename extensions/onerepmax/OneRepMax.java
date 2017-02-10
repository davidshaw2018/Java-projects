package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int repWeight = ap.nextInt("What is your standard rep weight?");
		int repNumber = ap.nextInt("How many reps can you do?");
		int maxWeight = repWeight + repWeight * repNumber / 30;
		System.out.println("Your one-rep max is " + maxWeight);
		System.out.println();
		int percentWeight = 0;
	
		for (int i = 0; i < 10; ++i) {
			percentWeight = (int)(maxWeight * (1 - .05 * (double)(i + 1)));
			System.out.println(Math.round(100 * (1 - .05 * (double)(i + 1))) + "%: " + percentWeight);
		}
		
	}

}
