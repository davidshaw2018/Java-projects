package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.blue);
		StdDraw.point(0.5,0.25);
		
		// larger green point
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(Color.green);
		StdDraw.point(.5, .75);
		
		// unfilled red triangle
		
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius(.01);
		StdDraw.line(0, 0, 0, .67);
		StdDraw.line(0, .67,.33, 0);
		StdDraw.line(.33, 0, 0, 0);
		// yellow circle, filled
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.75, .75, .2);
		

		// filled blue rectangle
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.75, .25, .1, .2);

		


	}

}
