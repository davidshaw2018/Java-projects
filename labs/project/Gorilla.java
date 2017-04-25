package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Gorilla implements Mechanics{
	private boolean hit;
	private final double xlocation;
	private final double ylocation;
	private final double size;

	public Gorilla(double xlocation, double ylocation) {
		this.hit = false;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
		this.size = .02;
	}
	
	/**
	 * 
	 * @return Gorilla's size
	 */
	public double getSize() {
		return this.size;
	}
	/**
	 * Generates a square at Gorilla's position
	 */
	@Override
	public void spawn() {
		StdDraw.setPenColor(Color.orange);
		StdDraw.filledSquare(this.xlocation, this.ylocation, this.size);
	}
	/** 
	 * Determines whether gorilla has been hit
	 * @param Banana
	 */
	public boolean collision(Banana b) {
		if (Math.abs(this.getXPos() - b.getXPos()) < this.size + b.getSize() && 
				Math.abs(this.getYPos() - b.getYPos()) < b.getSize() + this.size) {
			return true;
		}
		else return false;
	}

	@Override
	public double getXPos() {
		return this.xlocation;
	}
	
	public double getYPos() {
		return this.ylocation;
	}
	
	
	
	

}
