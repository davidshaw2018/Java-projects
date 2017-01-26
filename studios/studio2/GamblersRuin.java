package studio2;

import cse131.ArgsProcessor;

public class GamblersRuin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int startAmount = ap.nextInt("How much do you start with?");
		int winAmount = ap.nextInt("After how much will you walk away?");
		double winChance = ap.nextDouble("What's the chance you win a gamble?");
		int totalPlays = ap.nextInt("How many times will you simulate the problem?");
		double lossChance = 1 - winChance;
		double expectedRuin = (Math.pow(lossChance / winChance, startAmount) - Math.pow(lossChance / winChance, winAmount))/
				(1- Math.pow(lossChance / winChance, winAmount));
		if (winChance == lossChance) {expectedRuin = 1 - ((double)startAmount / (double)winAmount);}
		int j = 0;
		
		for (int i = 1; i <= totalPlays; i++) {
		String winLose = "";
			int rounds = 0;
			int currentAmount = startAmount;
			while (currentAmount != winAmount && currentAmount != 0) {
				boolean win = Math.random() < winChance;
				if (win) {currentAmount = currentAmount + 1;}
				else {currentAmount = currentAmount - 1;}
				rounds = rounds + 1;
				if (currentAmount == 0) {j = j + 1;}
			}
		if (currentAmount == winAmount) {winLose = "Win";}
		else {winLose = "Lose";}
		
	
		
		
		
		
		
		System.out.println(rounds + " rounds " + "     " + winLose);
		
		}
		System.out.println("Simulations: " + totalPlays);
		System.out.println("Losses: " + j);
		System.out.println("Actual ruin rate: " + (double)j / (double)totalPlays);
		System.out.println("Expected ruin rate: " + expectedRuin);
			
		}
			
			
		
		

	}


