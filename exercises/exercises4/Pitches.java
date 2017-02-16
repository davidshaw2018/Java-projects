package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A

		ArgsProcessor ap = new ArgsProcessor(args);
		int p = ap.nextInt("What pitch?");
		int p7 = p + 7;
		double frequency = 440.0 * Math.pow(2, p/12.0);
		double frequency7 = 440.0 * Math.pow(2, p7 / 12.0);
		System.out.println("For pitch " + p);
		System.out.println("We have frequency " + frequency);
		System.out.println("We have 5th frequency " + frequency7);
		
	}

}
