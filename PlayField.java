package yg;

public class PlayField {
	
	//field
	private PlayerIdentity[] board;
	private int boardSize;
	//Constructors
	//creates the board
	//default is a 3x3 with 9 boxes
	public PlayField() {
		board = new PlayerIdentity [9];
		this.boardSize = 9;
	}
	
	public PlayField(int boardSize) {
		this.boardSize = boardSize;
		board = new PlayerIdentity [boardSize];
		
	}
	//Getters and Setter
	public PlayerIdentity[] getBoard() {
		return board;
	}

	public void setBoard(PlayerIdentity[] board) {
		this.board = board;
	}
	//put an x or o 
	public void playTurn(int box, PlayerIdentity i) {
		board[box] = i;
	}
	
	
}
