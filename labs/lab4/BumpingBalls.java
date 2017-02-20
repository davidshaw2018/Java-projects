package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {

		StdDraw.setXscale(0, 2.0);
		StdDraw.setYscale(0.0, 2.0);

		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many balls?");
		double[] posx = new double[N];
		double[] velx = new double[N];
		double[] posy = new double[N];
		double[] vely = new double[N];
		double radius = .05;

		for (int x = 0; x < N; ++x) {
			posx[x] = 2 * Math.random();
			velx[x] = .1 * Math.random() - .05;
			posy[x] = 2 * Math.random();
			vely[x] = .1 * Math.random() - .05;
		}



		while(true) {
			StdDraw.setPenColor(StdDraw.CYAN);
			StdDraw.filledSquare(1.0, 1.0, 1.0);
			for (int i = 0; i < N; ++i) {
				if (posx[i] + velx[i] > 2.0 - radius || posx[i] + velx[i] < radius) {
					velx[i] = -velx[i];
				}
				if (posy[i] + vely[i] > 2.0 - 1.5 * radius || posy[i] + vely[i] < 1.5 * radius) {
					vely[i] = -vely[i];
				}
				for (int j = 0; j < N; ++j) {
					for (int k = j + 1; k < N; ++k) {
						double distance = Math.sqrt(Math.pow(posx[j] - posx[k], 2) + 
								Math.pow(posy[j]-posy[k], 2));
						if (distance < 2 * radius) {
							velx[j] = -velx[j];
							velx[k] = -velx[k];
							vely[j] = -vely[j];
							vely[k] = -vely[k];
						}
					}
				}
				posx[i] = posx[i] + velx[i];
				posy[i] = posy[i] + vely[i];
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(posx[i], posy[i], radius);
				
			}
			StdDraw.show(10);


		}




	}
}
