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
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0,100);
		this.hit = false;
		this.b1 = new Building(10);
		this.b2 = new Building(30);
		this.b3 = new Building(50);
		this.b4 = new Building(70);
		this.b5 = new Building(90);
	}
	/**
	 * Creates a collision if a banana hits the ground
	 * @param Banana b
	 */
	public boolean collision(Banana b) {
		double bx = b.getXPos();
		double by = b.getYPos();
		if (bx <= 20) {
			this.yPos = b1.getYPos();
		}
		else {
			if (20 < bx && bx <= 40) {
				this.yPos = b2.getYPos();
			}
			if (40 < bx && bx <= 60) {
				this.yPos = b3.getYPos();
			}
			if (60 < bx && bx <= 80) {
				this.yPos = b4.getYPos();
			}
		}
		if (bx > 80) {
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
		StdDraw.filledSquare(50,50, 50);
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
