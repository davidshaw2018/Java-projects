package project;


import java.awt.Color;

import sedgewick.StdDraw;

public class Banana implements Mechanics {
	private double xVelocity;
	private double yVelocity;
	private double xlocation;
	private double ylocation;
	private final double size;
	private double gravity;
	private double wind;
	
	public Banana() {
		this.size = .01;
	}
	/**
	 * Launch the banana
	 */
	public void launch(Gorilla g, Background b) {
		this.xlocation = g.getXPos();
		this.ylocation = g.getYPos();
		double vx = this.velocity * Math.cos(this.angle);
		double vy = this.velocity * Math.sin(this.angle);
		while (!this.explosion(g,b)) {
			StdDraw.clear();
			this.spawn();
			this.xlocation += vx;
			this.ylocation += vy;
			vy -= this.gravity;
			vx += this.wind;
			StdDraw.show();
		}
	}
	
	/**
	 * Sets velocity and angle
	 * @param velocity
	 * @param angle
	 */
	public void setTrajectory(double velocity, double angle, ) {
		this.xVelocity = velocity;
		this.angle = angle;
	}
	
	/**
	 * Sets the wind and gravity factors
	 * @param wind factor
	 * @param gravity factor
	 */
	public void grav(double wind, double grav) {
		
		this.wind = wind;
		this.gravity = grav;
	}

	
	public boolean explosion(Gorilla g, Background b) {
		boolean ans = false;
		double gx = g.getXPos();
		double gy = g.getYPos();
		if (Math.abs(this.getXPos() - gx) < g.getSize() + this.size && Math.abs(this.getYPos() - gy) < g.getSize() + this.size) {
			ans = true;
		}
		if (b.collision(this)) {
			ans = true;
		}
		return ans;
	}

	@Override
	public void spawn() {
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(this.xlocation, this.ylocation, this.size);
	}
	@Override
	public double getXPos() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getYPos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getSize() {
		return this.size;
	}
	
	

}
