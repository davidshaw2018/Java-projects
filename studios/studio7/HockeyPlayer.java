package studio7;

public class HockeyPlayer {

	public static void main(String[] args) {
		HockeyPlayer dave = new HockeyPlayer();
		dave.playSeason(82);
		System.out.println(dave.getname());
		System.out.println("Jersey Number: " +dave.getnumJersey());
		System.out.println("Handed: " +dave.getrHanded());
		System.out.println("Shoots: " +dave.getrShooting());
		System.out.println("Goals: " +dave.getnumGoals());
		System.out.println("Assists: " +dave.getnumAssists());
		System.out.println("Points: " +dave.getnumPoints());
		System.out.println("Games: " +dave.games());
		
		
	}
	private String name;
	private boolean rHanded;
	private boolean rShooting;
	private int numGoals;
	private int numAssists;
	private int numPoints;
	private int numJersey;
	private int games;

	public HockeyPlayer (){
		this.numGoals = 0;
		this.numAssists = 0;
		this.numPoints = 0;
		this.games =0;
		this.name = "David SHWA";
		this.rHanded = true;
		this.rShooting = true;
		this.numJersey = 69;
	}

	public void playGame(){
		games ++;
		this.numGoals += (int)3*(Math.random());
		this.numAssists += (int)3*(Math.random());
		this.numPoints = numGoals + numAssists;
		return;
	}


	public void playSeason(int seasonLength) {
		for (int i = 0; i < seasonLength; i ++){
			playGame();
		}
	}
	public String getname() {
		// SHWA is sleezzy but  works
		return this.name;
	}
	public boolean getrHanded() {
		// SHWA is sleezzy but he works
		return this.rHanded;
	}
	public boolean getrShooting() {
		// SHWA is sleezzy but he works
		return this.rShooting;
	}
	public int getnumGoals() {
		// SHWA is sleezzy but he works
		return this.numGoals;
	}
	
	public int getnumAssists() {
		// SHWA is sleezzy but he works
		return this.numAssists;
	}
	public int getnumPoints() {
		// SHWA is sleezzy but he works
		return this.numPoints;
	}
	
	public int getnumJersey() {
		// SHWA is sleezzy but he works
		return this.numJersey;
	}

	public int games () {
		// SHWA is sleezzy but he works
		return this.games;
	}
}