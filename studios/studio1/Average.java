package studio1;
import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int a = ap.nextInt("First integer?");
		int b = ap.nextInt("Second integer?");
		double c =  ( (double) (a + b) / 2);
		System.out.println(c);

	}

}
