package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Building implements Mechanics {
	
	private double width;
	private double height;
	private double xlocation;
	
	public Building(double xloc){
		this.width = .2;
		this.height = .6*Math.random();
		this.xlocation = xloc;
	}

	public double getHeight() {
		return this.height;
	}

	@Override
	public void spawn() {
		Color[] colors = new Color[] {StdDraw.BLACK,StdDraw.DARK_GRAY, StdDraw.MAGENTA,StdDraw.BOOK_BLUE, StdDraw.RED};
		int i = (int)(5*Math.random());
		StdDraw.setPenColor(colors[i]);
		StdDraw.filledRectangle(this.xlocation, this.height/2, this.width/2, this.height/2);
	}

	@Override
	public double getXPos() {
		return this.xlocation;
	}

	@Override
	public double getYPos() {
		return this.height;
	}
	

}
