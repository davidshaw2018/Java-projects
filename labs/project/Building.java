package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Building implements Mechanics {

	private double width;
	private double height;
	private double xlocation;
	private Color color;

	public Building(double xloc){
		this.width = 20;
		this.height = 60*Math.random();
		this.xlocation = xloc;
		Color[] colors = new Color[] {StdDraw.BLACK,StdDraw.DARK_GRAY, StdDraw.MAGENTA,StdDraw.BOOK_BLUE, StdDraw.RED};
		int i = (int)(5*Math.random());
		this.color = colors[i];
	}
	/**
	 * 
	 * @return Building's height
	 */
	public double getHeight() {
		return this.height;
	}
	/**
	 * Draws a building
	 */
	@Override
	public void spawn() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledRectangle(this.xlocation, this.height/2, this.width/2, this.height/2);
	}
	/**
	 * Gives building's x-position
	 */
	@Override
	public double getXPos() {
		return this.xlocation;
	}
	/**
	 * Gives building's y position
	 */
	@Override
	public double getYPos() {
		return this.height;
	}


}
