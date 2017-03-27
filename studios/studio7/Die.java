package studio7;

public class Die {
	
	private int numSides;
	public Die (int n) {
		this.numSides = n;
	}
	/**
	 * no inputs
	 * @return random number between 1 and numSides
	 */
	public int roll() {
		return (int)(1+this.numSides*Math.random());
	}
	
	
	public static void main(String[] args) {
		Die rosslandia = new Die(6);
		System.out.println("Number of sides:" + 6);
		System.out.println("Roll: " + rosslandia.roll());
	}

}
