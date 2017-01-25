package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		
		if (x > y) {
			x = y;     // Bad
			y = x;     // swap!!
		}
		
		System.out.println("x and y are now"
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer:
		// If x>y, the if statement the assigns the inputed value of y
		// to x. The next line then assigns a new value of y equal to
		// x, but in this case x is now the inputed value of y. If I input 
		// x=6 and y=4, then the if statement assigns x=4 and y=x=4. 
		//
		//

	}

}
