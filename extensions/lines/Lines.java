package lines;

import java.awt.Color;

import sedgewick.StdDraw;

public class Lines {

	/**
	 * 
	 * @param x1 x coordinate of starting point
	 * @param y1 y coordinate of starting point
	 * @param x2 x coordinate of ending point
	 * @param y2 y coordinate of ending point
	 */
	public static void drawLine(double x1, double y1, double x2, double y2) {
		double radius = 0.004;
		if (Math.abs(x2-x1) < .5*radius && Math.abs(y2-y1) < .5*radius) {
			return;
		}
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(radius);
		StdDraw.point(x1, y1);
		double xInterval = .5*radius;
		double yInterval = .5*radius;
		if (x2<x1) {
			xInterval = -.5*radius;
		}
		if (y2<y1) {
			yInterval = -.5*radius;
		}
		StdDraw.pause(20);
		drawLine(x1+xInterval, y1+yInterval, x2, y2);
	}
	
	
	/**
	 * Code to test the drawLine method visually
	 */
	public static void main(String[] args) {
		
		//
		// Test the drawing program
		//
		drawLine(0,0,1,1); // lower left to upper right
		drawLine(0,1,1,0); // upper left to lower right
		
		//
		// Draw rectangles of decreasing width and height
		//
		for (double r = 0.25; r < 0.5; r = r+.005) {
			double s = 1-r;
			drawLine(r,r, r, s);
			drawLine(r, s, s, s);
			drawLine(s, s, s, r);
			drawLine(s, r, r, r);
		}
		System.out.println("done drawing");
	}

}
