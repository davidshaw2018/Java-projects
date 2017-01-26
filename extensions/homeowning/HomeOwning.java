package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	
	String name = ap.nextString("What is the name of the complex?");
	String zip = ap.nextString("What is the zip code?");
	int monthlyRent = ap.nextInt("What is the monthly rent?");
	double dailyInterest = ap.nextDouble("What is the daily interest?");
	
	int yearlyRent = 12 * monthlyRent;
	double weeklyRent = (double)Math.round(100 * yearlyRent / 52) / 100;
	double yearlyInterest = (double)Math.round(36500 * dailyInterest) / 100;
	double weeklyInterest = (double)Math.round(100 * yearlyInterest / 52) / 100;
	boolean which = yearlyRent > yearlyInterest;
	String whatDo = "";
	
	if (which) {whatDo = "buy.";}
	else {whatDo = "rent.";}
	
	System.out.println(name + " is located in the " + zip + " zip code.\n"
			+ "Rent per year is " + yearlyRent + ".\n"
			+ "Rent per week is " + weeklyRent + ".\n\n"
			+ "Interest per year is " + yearlyInterest + ".\n"
			+ "Interest per week is " + weeklyInterest + ".\n\n"
			+ "I should " + whatDo);

}}
