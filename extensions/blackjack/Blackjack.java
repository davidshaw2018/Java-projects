package blackjack;

import cse131.ArgsProcessor;

public class Blackjack {

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
			
			for (int j = 1; j < p; ++j) {
				System.out.println("Player " + j + " has " + scores[j]);
				if (scores[j] == 21) {
					System.out.println("Blackjack!");
				}
				boolean hit = ap.nextBoolean("Hit?");
				if (hit) {
					while (hit) {
						int nextCard = (int)(2 + 13 * Math.random());
						if (nextCard > 11) {
							scores[j] = scores[j] + 10;
						}
						else scores[j] = scores[j] + nextCard;
						if (scores[j] < 21) {
							System.out.println(scores[j]);
							hit = ap.nextBoolean("Hit?");
						}
						else if (scores[j] == 21) {
							System.out.print(scores[j] + "  Blackjack!\n");
							hit = false;
						}
						else if (scores[j] > 21) {
							System.out.print(scores[j] + "  Bust!\n");
							hit = false;
						}

					}
				}
				System.out.println();
			}

			System.out.println("Dealer has " + scores[0]);
			if (scores[0] < 17) {
				while (scores[0] < 17) {
					int nextCard = (int)(2 + 13 * Math.random());

					if (nextCard > 11) {
						scores[0] = scores[0] + 10;
					}
					else scores[0] = scores[0] + nextCard;
					System.out.println("Dealer has " + scores[0]);
					if (scores[0] == 21) {
						System.out.println("Dealer has blackjack!\n");
					}
					if (scores[0] > 21) {
						System.out.println("Dealer busts!\n");
					}
				}
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