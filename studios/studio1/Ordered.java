package studio1;

import cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean a = x < y;
		boolean b = y < z;
		boolean c = a && b;
		boolean d = x > y;
		boolean e = y > z;
		boolean f = d && e;
		
		boolean isOrdered = c || f;
		System.out.println(isOrdered);
		

	}

}
