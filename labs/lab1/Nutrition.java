package lab1;
import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Name of food?");
		double carbs = ap.nextDouble("Grams of carbs?");
		double fat = ap.nextDouble("Grams of fat?");
		double protein = ap.nextDouble("Grams of protein?");
		int statedCal = ap.nextInt("Number of calories on the label?");
		double carbsCal = 4 * carbs;
		double fatsCal = 9 * fat;
		double proteinCal = 4 * protein;
		double totalCal = carbsCal + fatsCal + proteinCal;
		double missingCal = totalCal - statedCal;
		double fiber = missingCal / 4;
		double carbPercent = carbsCal / Math.round(totalCal);
		
		
		System.out.println(carbPercent);
				
	}

}
