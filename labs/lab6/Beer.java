package lab6;

public class Beer {

	public static String bottlesOfBeer(int n) {
		if (n>0) {
			return n + " bottles of beer on the wall. " + n + " bottles of beer. Take one down, "
					+ "pass it around, " + bottlesOfBeer(n-1);
		}
		else return "that's all the beer on the wall!";
	}

	
	public static void main(String[] args) {
		System.out.println(bottlesOfBeer(5));
		
	}

}
