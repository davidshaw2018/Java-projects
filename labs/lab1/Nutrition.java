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
		double carbsCal = (double)Math.round(40 * carbs) / 10;
		double fatsCal = (double)Math.round(90 * fat) / 10;
		double proteinCal = 4 * protein;
		double totalCal = carbsCal + fatsCal + proteinCal;
		double missingCal = (double)Math.round(10 * (totalCal - statedCal)) / 10;
		double fiber = missingCal / 4;
		double carbPercent = (double)Math.round(1000 * carbsCal / (statedCal)) / 10;
		double fatsPercent = (double)Math.round(1000 * fatsCal / (statedCal)) / 10;
		double proteinPercent = (double)Math.round(1000 * proteinCal / (statedCal)) / 10;
		boolean lowCarb = carbPercent < 25;
		boolean lowFat = fatsPercent < 15;
		boolean heads = Math.random() < 0.5;
		
		
		System.out.println("" + name + " has: \n" + carbs + " grams of"
				+ " carbohydrates = " + carbsCal + " Calories, \n"
				 + fat + " grams of fat = " + fatsCal + " Calories, \n"
				  + protein + " grams of protein = " + proteinCal + " Calories. \n\n"
				   + "This food has " + statedCal + " available Calories. \n"
				   + "With " + missingCal + " unavailable Calories, \n" + "this food has "
				   + fiber + "grams of fiber. \n\n"
				   + "Approximately " + carbPercent + "% of your food is carbohydrates,\n"
				   + fatsPercent + "% of your food is fats,\n"
				   + proteinPercent + "% of your food is protein.\n\n"
				   + "Is this food acceptable for a low-carb diet? " + lowCarb
				   + "\n" + "Is this food acceptable for a low-fat diet? " +lowFat 
				   + "\n" + "By a coin flip, should you eat " + name + "?" + heads
				   
				  );
				
	}

}
