package expectedvalue;

import cse131.ArgsProcessor;

public class utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double probGame = ap.nextDouble("What is the probability your startup succeeds?");
		int gameValue = (int)(190000 * probGame) + (int)(5000 * (1 - probGame));
		int progValue = (int)(110000 + 50000 * Math.random());
		int gameUtil = 3 * (int)Math.sqrt(gameValue);
		int progUtil = 2 * (int)Math.sqrt(progValue);
		boolean job = gameUtil > progUtil;
		
		System.out.println("You get " + gameValue + " from the startup.");
		System.out.println("You get " + progValue + " from the job.");
		System.out.println("The startup is worth " + gameUtil + " to you.");
		System.out.println("The job is worth " + progUtil + " to you.");
		System.out.println("Should you be a gamer? " + job);
		
		
	}

}
