package exercises2;

public class Die {

	public static void main(String[] args) {

		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//
		double num = Math.random();
		boolean one = num < .167;
		boolean two = .167 < num && num < .333;
		boolean three = .333 < num && num < .5;
		boolean four = .5 < num && num < .667; 
		boolean five = .667 < num && num < .833;
		boolean six = .833 < num;
		int die = 0;
		
		if (one) {die = 1;}
		if (two) {die = 2;}
		if (three) {die = 3;}
		if (four) {die = 4;}
		if (five) {die = 5;}
		if (six) {die = 6;}

		
		
		System.out.println(die);
		
		
	}
}

		
		
