package project;

import cse131.ArgsProcessor;

public class Banana {
	private double velocity;
	private double angle;
	private double location;
	private double size;
	private String[] args;
	private double gravity;
	ArgsProcessor ap = new ArgsProcessor(args);
	
	public Banana() {
		this.velocity = ap.nextDouble("Velocity");
		this.angle = ap.nextDouble("Angle");
		this.gravity = ap.nextDouble("Gravity");
		this.size = .05;
	}
	
	public void launch() {
		double vx = this.velocity * Math.cos(this.angle);
		double vy = this.velocity * Math.sin(this.angle);
		while (this.location < 1-this.size && this.location > this.size) {
			
		}
	}
	
	

}
