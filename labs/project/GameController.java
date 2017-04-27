package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GameController {


	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		while(true) {
			StdDraw.clear();
			boolean p1Win = false;
			Background b = new Background();
			Gorilla g1 = new Gorilla(10, b.g1Y() + 2);
			Gorilla g2 = new Gorilla(90, b.g2Y() + 2);
			Player p1 = new Player(g1,b,true);
			Player p2 = new Player(g2,b,false);
			Banana ban = new Banana();
			double wind = (double)Math.round(1000*(.5*Math.random() - .25)) / 1000;
			b.spawn();
			g1.spawn();
			g2.spawn();
			StdDraw.show();
			double gravity = ap.nextDouble("What is the gravity?");
			ban.grav(wind,gravity);
			StdDraw.text(50, 75, "Wind: " + wind + ", Gravity: " + gravity);
			while (!g1.collision(ban) && !g2.collision(ban)) {
				if (p1.getTurn()) {
					ban.setTrajectory(ap.nextDouble("Player 1: Velocity?"), ap.nextDouble("Player 1: Angle?"), p1);
					p1.takeTurn(ban, p2.getGorilla());
					p2.takeTurn(ban, p1.getGorilla());
				}
				else {
					ban.setTrajectory(ap.nextDouble("Player 2: Velocity?"), ap.nextDouble("Player 2: Angle?"), p2);
					p2.takeTurn(ban, p1.getGorilla());
					p1.takeTurn(ban, p2.getGorilla());
				}
				if (g2.collision(ban)) {
					p1Win = true;
				}
			}
			if (!p1Win) {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.text(50, 85, "Player 2 Wins!");
			}
			else {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.text(50, 85, "Player 1 Wins!");
			}
			StdDraw.show();
			StdDraw.pause(3000);
		}



	}

}
