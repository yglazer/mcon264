package yg;

public class Game {
	
	//Fields
	public PlayField playfield;
	
	
	//constructor
	public Game() {
		playfield = new PlayField();
	}
	
	//getters and setters
		public PlayField getPlayfield() {
			return playfield;
		}

		public void setPlayfield(PlayField playfield) {
			this.playfield = playfield;
		}

	
	//methods
	public void reset() {
		playfield = new PlayField();
	}
	public void exit() {
		System.out.println("Bye-Bye");
		System.exit(0);
	}
	
}
