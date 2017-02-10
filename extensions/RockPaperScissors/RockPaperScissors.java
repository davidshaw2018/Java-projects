package RockPaperScissors;

import cse131.ArgsProcessor;

public class RockPaperScissors {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numRounds = ap.nextInt("How many rounds do you want to play?");
		int playerRandom = 0;
		int playerRotate = 0;
		String randPlay = "";
		String rotPlay = "";
		int randomWins = 0;
		int rotateWins = 0;
		int ties = 0;


		for (int i = 0; i < numRounds; ++i) {
			if (playerRotate >= 3) {
				playerRotate = 0;}

			for (int j = 0; j < 3; ++j); {
				playerRandom = (int)(1 + 3 * Math.random());
				playerRotate = playerRotate + 1;

				if (playerRandom == 1) {
					randPlay = "ROCK";}
				else if (playerRandom == 2) {
					randPlay = "PAPER";}
				else if (playerRandom == 3) {
					randPlay = "SCISSORS";}
				if (playerRotate == 1) {
					rotPlay = "ROCK";}
				else if (playerRotate == 2) {
					rotPlay = "PAPER";}
				else if (playerRotate == 3) {
					rotPlay = "SCISSORS";}


				if (playerRandom > playerRotate && playerRandom != 1) {
					randomWins = randomWins + 1;
				}
				else if (playerRandom == playerRotate) {
					ties = ties + 1;
				}
				else if (playerRotate > playerRandom && playerRotate != 1) {
					rotateWins = rotateWins + 1;
				}
				else if (playerRotate == 1 && playerRandom == 3) {
					rotateWins = rotateWins + 1;
				}
				else if (playerRandom == 1 && playerRotate == 3) {
					randomWins = randomWins + 1;
				}

				System.out.println("The randomizing player plays " + randPlay + ""
						+ " and the rotating player plays " + rotPlay);
			}
		}
		System.out.println();	
		System.out.println("The randomizing player won " + randomWins + " times.");
		System.out.println("The rotating player won " + rotateWins + " times.");
		System.out.println("They tied " + ties + " times.");
		double randWinPercent = Math.round(1000 * (double)randomWins / numRounds) / 10;
		double rotateWinPercent = Math.round(1000 * (double)rotateWins / numRounds) / 10;
		double tiePercent = Math.round(1000 * (double)ties / numRounds) / 10;
		System.out.println("The randomizer won " + randWinPercent + "% of the time.");
		System.out.println("The rotater won " + rotateWinPercent + "% of the time.");
		System.out.println("They tied " + tiePercent + "% of the time.");
	}


}
