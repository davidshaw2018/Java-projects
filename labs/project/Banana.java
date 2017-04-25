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
		this.size = 1;
	}
	/**
	 * Launch the banana
	 */
	public void launch(Gorilla target, Background b, Gorilla launcher) {
		while (!this.explosion(target,b)) {
			b.spawn();
			target.spawn();
			launcher.spawn();
			StdDraw.text(50, 75, "Wind: " + wind + ", Gravity: " + gravity);
			this.xlocation += this.xVelocity;
			this.ylocation += this.yVelocity;
			yVelocity -= this.gravity;
			xVelocity += this.wind;
			this.spawn();
			StdDraw.show(10);
		}
	}

	/**
	 * Sets velocity and angle
	 * @param velocity
	 * @param angle
	 */
	public void setTrajectory(double velocity, double angle, Player player) {
		if (player.getGorilla().getXPos() < 20) {
			this.xVelocity = velocity * Math.cos((3.1415926/180)*angle);
			this.yVelocity = velocity * Math.sin((3.1415926/180)*angle);
		}
		else {
			this.xVelocity = -velocity * Math.cos((3.1415926/180)*angle);
			this.yVelocity = velocity * Math.sin((3.1415926/180)*angle);
		}
		this.setPosition(player.getGorilla().getXPos(), player.getGorilla().getYPos() + 3);
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
		if (this.xlocation < 0 || this.ylocation > 100) {
			ans = true;
		}
		return ans;
	}
	/**
	 * Resets banana's position
	 * @param xPos
	 * @param yPos
	 */
	public void setPosition(double xPos, double yPos) {
		this.xlocation = xPos;
		this.ylocation = yPos;
	}

	@Override
	public void spawn() {
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(this.xlocation, this.ylocation, this.size);
	}
	@Override
	public double getXPos() {
		return this.xlocation;
	}
	@Override
	public double getYPos() {
		return this.ylocation;
	}

	public double getSize() {
		return this.size;
	}



}
