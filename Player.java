package yg;

public class Player {

	// Field= X or O identity
	// running score until you exit
	private PlayerIdentity i;
	private int score;

	// constructor
	public Player(PlayerIdentity i) {
		this.i = i;
		score = 0;
	}

	// getter and setter
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Set Identity
	public void setPlayerIdentity(PlayerIdentity i) {
		this.i = i;
	}

	// Get Identity
	public PlayerIdentity getPlayerIdentity() {
		return i;
	}

	// player won a game add one to score
	public void updateScore() {
		score += 1;
	}
}
