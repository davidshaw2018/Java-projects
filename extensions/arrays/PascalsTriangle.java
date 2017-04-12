package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many rows should we do?") + 1;
		int[][] triangle = new int[N][N];
		
		System.out.println("    column");
		System.out.print("    ");
		for (int i = 0; i < N; ++i) {
			System.out.print(i + "   ");
		}
		System.out.println("\nrow\n");
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j <= i; ++j) {
				if (j == 0) {
					triangle[i][j] = 1;
				}
				else {
					if (i == j) {
						triangle[i][j] = 1;
					}
					else {
						triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
					}
				}	
			}
		}
		for (int i = 0; i < N; ++i) {
			System.out.print(i + "   ");
			for (int j = 0; j < N; ++j) {
				if (triangle[i][j] != 0) {
					if (triangle[i][j] < 10) {
						System.out.print(triangle[i][j] + "   ");
					}
					if (triangle[i][j] >= 10) {
						System.out.print(triangle[i][j] + "  ");
					}
				}
			}
			System.out.println();
		}
	}

}
