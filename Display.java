package yg;

import java.util.Objects;

public class Display {
	//Field
	private PlayField pf;
	private String [] stringBoard = new String [9];
	
	//Change empty boxes to numbers
	public String[] swapToNumbers() {
		PlayerIdentity[] board =pf.getBoard();
		for (int i = 0;i < 9;i++) {
			if (board[i] == null) {
				stringBoard [i] = String.valueOf(i);
			}else {
				stringBoard [i] = String.valueOf(board[i]);
			}
		}
		return stringBoard;
	}
	//Change empty boxes to numbers-static
	public static String[] swapToNumbers(PlayerIdentity [] board) {
		String [] stringBoard = new String [9];
		for (int i = 0;i < 9;i++) {
			if (Objects.equals(board[i], null)) {
				stringBoard [i] = String.valueOf(i);
			}else {
				stringBoard [i] = String.valueOf(board[i]);
			}
		}
		return stringBoard;
	}
	//Print board
	public void print() {
		stringBoard = swapToNumbers();
		StringBuilder sb = new StringBuilder ();
		sb.append("=====");
		sb.append("=" + stringBoard[1] +"\t"+ stringBoard[2] +"\t"+ stringBoard[3] + "=");
		sb.append("=" + stringBoard[4] +"\t"+ stringBoard[5] +"\t"+ stringBoard[6] + "=");
		sb.append("=" + stringBoard[7] +"\t"+ stringBoard[8] +"\t"+ stringBoard[9] + "=");
		sb.append("=====");
		String str = sb.toString();
		System.out.println(str);
	}
	//Print board-static
	public static void print(PlayerIdentity [] board) {
		String [] stringBoardStatic = swapToNumbers(board);
		StringBuilder sb = new StringBuilder ();
		sb.append("==================\n");
		sb.append("=" + stringBoardStatic[0] +"\t"+ stringBoardStatic[1] +"\t"+ stringBoardStatic[2] + "=\n");
		sb.append("=" + stringBoardStatic[3] +"\t"+ stringBoardStatic[4] +"\t"+ stringBoardStatic[5] + "=\n");
		sb.append("=" + stringBoardStatic[6] +"\t"+ stringBoardStatic[7] +"\t"+ stringBoardStatic[8] + "=\n");
		sb.append("==================");
		String str = sb.toString();
		System.out.println(str);
	}
}
