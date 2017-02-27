package minesweeper;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {

		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		boolean[][] grid = new boolean[rows][cols];
		int[][] bombs = new int[rows][cols];

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (Math.random() < percent) {
					grid[i][j] = true;
				}
			}
		}

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (grid[i][j] == true) {
					System.out.print("* ");
				}
				else System.out.print(". ");
			}
			System.out.print("  ");
			int rowStart = i-1;
			if (i == 0) {
				rowStart = i;
			}
			int rowEnd = i+1;
			if (i == rows-1) {
				rowEnd = i;
			}

			int j = 0;
			while (j < cols) {
				int colStart = j-1;
				if (j == 0) {
					colStart = j;
				}
				int colEnd = j+1;
				if (j == cols-1) {
					colEnd = j;
				}

				if (grid[i][j] == true) {
					System.out.print("* ");
				}
				else if (grid[i][j] == false) {
					for (int m = rowStart; m <= rowEnd; ++m) {
						for (int n = colStart; n <= colEnd; ++n) {
							if (grid[m][n] == true) {
								bombs[i][j] += 1;
							}
						}
					}
					System.out.print(bombs[i][j] + " ");
				}
				j += 1;
			}
			System.out.println();
		}
	}
}
