package project;

public class Player {
	
	private Gorilla player;
	private boolean turn;
	private Background b;
	
	public Player(Gorilla player, Background b) {
		this.player = player;
		this.turn = true;
		this.b = b;
	}
	/**
	 * Take a turn; if it's P1's turn, launch a banana, otherwise it becomes his turn
	 */
	public void takeTurn() {
		if (this.turn) {
			Banana b = new Banana();
			b.launch(this.player, this.b);
			this.turn = false;
		}
		else {
			this.turn = true;
		}
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
	 * @return P1's gorilla
	 */
	public Gorilla getGorilla() {
		return this.player;
	}
	
	
	

	
}
