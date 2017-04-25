package project;

public class Player {
	
	private Gorilla player;
	public boolean turn;
	private Background b;
	
	public Player(Gorilla player, Background b, boolean turn) {
		this.player = player;
		this.turn = turn;
		this.b = b;
	}
	
	/**
	 * Take a turn; if it's P1's turn, launch a banana, otherwise it becomes his turn
	 */
	public void takeTurn(Banana b, Gorilla target) {
		if (this.turn) {
			b.launch(target, this.b, this.player);
		}
		this.turn = !this.turn;
	}
	/**
	 * 
	 * @return Whose turn it is
	 */
	public boolean getTurn() {
		return this.turn;
	}
	/**
	 * 
	 * @return Player's gorilla
	 */
	public Gorilla getGorilla() {
		return this.player;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.cos((3.1415926/180)*30));
	}
	
	
	

	
}
