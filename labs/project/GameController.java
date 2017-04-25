package project;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GameController {


	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		Background b = new Background();
		b.spawn();
		Gorilla g1 = new Gorilla(.1, b.g1Y() + .02);
		Gorilla g2 = new Gorilla(.9, b.g2Y() + .02);
		Player p1 = new Player(g1,b);
		Player p2 = new Player(g2,b);
		double wind = (double)Math.round(1000*(.05*Math.random() - .025)) / 1000;
		Banana ban = new Banana();
		
		g1.spawn();
		g2.spawn();
		
//		double gravity = ap.nextDouble("What is the gravity?");
		double gravity = .01;
		
		StdDraw.text(.5, .75, "Wind: " + wind + ", Gravity: " + gravity);
		
		while (!g1.collision(ban) && !g2.collision(ban)) {
			if (p1.getTurn()) {
				ban.setTrajectory(ap.nextDouble("Velocity?"), ap.nextDouble("Angle?"));
				ban.launch(g1, b);
			}
			else {
				ban.setTrajectory(ap.nextDouble(), angle);
				ban.launch(g2, b);
			}
		}
		
		
		
		

	}

}
