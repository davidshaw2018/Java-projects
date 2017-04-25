package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Background implements Mechanics{
	
	private boolean hit;
	private Building b1;
	private Building b2;
	private Building b3;
	private Building b4;
	private Building b5;
	private double yPos;
	
	public Background() {
		this.hit = false;
		this.b1 = new Building(.1);
		this.b2 = new Building(.3);
		this.b3 = new Building(.5);
		this.b4 = new Building(.7);
		this.b5 = new Building(.9);
	}
	/**
	 * Creates a collision if a banana hits the ground
	 * @param Banana b
	 */
	public boolean collision(Banana b) {
		double bx = b.getXPos();
		double by = b.getYPos();
		if (bx <= .2) {
			this.yPos = b1.getYPos();
		}
		else {
			if (.2 < bx && bx <= .4) {
				this.yPos = b2.getYPos();
			}
			if (.4 < bx && bx <= .6) {
				this.yPos = b3.getYPos();
			}
			if (.6 < bx && bx <= .8) {
				this.yPos = b4.getYPos();
			}
		}
		if (bx > .8) {
			this.yPos = b5.getYPos();
		}
		if (by+b.getSize() < this.yPos) {
			return true;
		}
		else return false;
	}
	
	
	@Override
	public void spawn() {
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledSquare(.5,.5, .5);
		b1.spawn();
		b2.spawn();
		b3.spawn();
		b4.spawn();
		b5.spawn();
	}
	@Override
	public double getXPos() {
		return 0;
	}
	@Override
	public double getYPos() {
		return 0;
	}
	
	public double g1Y() {
		return b1.getHeight();
	}
	public double g2Y() {
		return b5.getHeight();
	}
	
}
