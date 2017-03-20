package blackjack;

import cse131.ArgsProcessor;

public class BlackjackTrial {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int p = ap.nextInt("How many players?") + 1;
		int[][] cards = new int[p][2];
		int[] scores = new int[p];
		int n = ap.nextInt("How many games?");

		for (int i = 0; i < n; ++i) {

			for (int j = 0; j < p; ++j) {
				for (int k = 0; k < 2; ++k) {
					cards[j][k] = (int)(2 + 13 * Math.random());
					if (cards[j][k] > 11) {
						cards[j][k] = 10;
					}
				}
			}
			for (int j = 0; j < p; ++j) {
				scores[j] = cards[j][0] + cards[j][1];
			}

			System.out.println("Round " + (i + 1) + ": Dealer shows " + cards[0][0] + "\n");

			for (int j = 1; j < p-1; ++j) {
				System.out.println("Computer player " + j + " has " + scores[j]);
				if (scores[j] == 21) {
					System.out.println("Blackjack!");
				}
				boolean hit = true;
				if (Math.random() <.5) {
					hit = false;
				}
				while (hit) {

					int nextCard = (int)(2 + 13 * Math.random());
					if (nextCard > 11) {
						scores[j] = scores[j] + 10;
					}
					else scores[j] = scores[j] + nextCard;
					if (scores[j] < 21) {
						System.out.println("Hit: " + scores[j]);
					}
					else if (scores[j] == 21) {
						System.out.print("Hit: " + scores[j] + "  Blackjack!\n");
						hit = false;
					}
					else if (scores[j] > 21) {
						System.out.print("Hit: " + scores[j] + "  Bust!\n");
						hit = false;
					}
					if (Math.random() <.5) {
						hit = false;
					}
				}
				if (scores[j] < 21) {
					System.out.println("Stay");
				}
				System.out.println();
			}
			System.out.println("You have " + scores[p-1]);
			boolean playerHit = ap.nextBoolean("Hit?");
			if (playerHit) {
				while (playerHit) {
					int nextCard = (int)(2+13*Math.random());
					if (nextCard > 11) {
						scores[p-1] += 10;
					}
					else scores[p-1] += nextCard;
					if (scores[p-1] < 21) {
						System.out.println("Hit: " + scores[p-1]);
					}
					else if (scores[p-1] == 21) {
						System.out.print("Hit: " + scores[p-1] + " Blackjack!\n"); 
					}
					else if (scores[p-1] > 21) {
						System.out.print("Hit: " + scores[p-1] + " Bust!\n");
					}
					if (scores[p-1] >= 21) {
						playerHit = false;
					}
					else playerHit = ap.nextBoolean("Hit?");
				}
				
			}
			if (scores[p-1] < 21) {
				System.out.println("Stay");
			}
			System.out.println("\nDealer has " + scores[0]);
			if (scores[0] < 17) {
				while (scores[0] < 17) {
					int nextCard = (int)(2 + 13 * Math.random());

					if (nextCard > 11) {
						scores[0] = scores[0] + 10;
					}
					else scores[0] = scores[0] + nextCard;
					System.out.println("Hit: Dealer has " + scores[0]);
					if (scores[0] == 21) {
						System.out.println("Dealer has blackjack!\n");
					}
					if (scores[0] > 21) {
						System.out.println("Dealer busts\n");
					}
				}
			}
			if (scores[0] < 21) {
				System.out.println("Dealer stays");
			}
			System.out.println();
			for (int l = 1; l < p; ++l) {
				if (scores[l] > 21) {
					System.out.println("Player " + l + " busts. Dealer wins");
				}
				if (scores[l] == 21) {
					System.out.println("Player " + l + " has blackjack. "
							+ "Player " + l + " wins!");
				}
				if (scores[l] < 21) {
					if (scores[0] > 21) {
						System.out.println("Dealer busts. Player " + l + " wins!");
					}
					else if (scores[0] > scores[l]) {
						System.out.println("Player " + l + " loses.");
					}
					else if (scores[l] > scores[0]) {
						System.out.println("Player " + l + " wins!");
					}
				}
			}
			System.out.println();
		}
	}
}


