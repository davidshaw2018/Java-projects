package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit { 
	
	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	int Speed = ap.nextInt("What was your speed?");
	int speedLimit = ap.nextInt("What is the speed limit?");
	int excessSpeed = Speed - speedLimit;
	int initialFine = (excessSpeed > 9) ? 50 : 0;
	int extraFine = (excessSpeed > 9) ? 10 * (excessSpeed - 10) : 0;
	int totalFine = initialFine + extraFine;
	
	System.out.println("You reported a speed of " + Speed + " MPH in a "
			 + speedLimit + " MPH zone. You went " + excessSpeed + 
			 " over the speed limit. Your fine is $" + totalFine + ".");
			
	
	
	
	
	
	
	
	}
}
