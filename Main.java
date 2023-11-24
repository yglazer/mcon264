package yg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//starting game
		Game game = new Game();
		//creating players
		Player player1 = new Player(PlayerIdentity.x);
		Player player2 = new Player(PlayerIdentity.o);
		
		
		PlayerIdentity winner = null;
		//Player queue
		ArrayListQueue<Player> players = new ArrayListQueue<Player>();

		String again = "y";
		//Scanner object
		Scanner k = new Scanner(System.in);
		//floater variable
		int floater;
		
		//THE GAME - keep on playing 
		while (again.charAt(0) == 'y') {
			Winner w = new Winner(game.getPlayfield());
			players.clear();
			//load up player queue
			for (int y = 0; y < 5; y++) {
				players.enqueue(player1);
				players.enqueue(player2);
			}
			winner = null;
			//loop until there is a winner or it is a draw
			for (int i = 0; i < 9; i++) {

				
				Display.print(game.getPlayfield().getBoard());
				System.out.println("Where do you want to put your " + players.peek().getPlayerIdentity());
				floater = k.nextInt();
				game.getPlayfield().playTurn(floater, players.dequeue().getPlayerIdentity());
				winner = w.checkForLine();
				if (winner != null) {
					break;
				}

			}
			//clear buffer
			k.nextLine();
			//display board
			Display.print(game.getPlayfield().getBoard());
			
			//controls output:
			if (winner == null) {
				System.out.println("Draw");
			} else {
				System.out.println("The winner is: " + winner);
			}
			if (winner == player1.getPlayerIdentity()) {
				player1.updateScore();
			} else if (winner == player2.getPlayerIdentity()) {
				player2.updateScore();
			}
			//Displays scores
			System.out.println("SCORES");
			System.out.println(player1.getPlayerIdentity() + ": " + player1.getScore());
			System.out.println(player2.getPlayerIdentity() + ": " + player2.getScore());
			System.out.println("Do you want to play again? y/n");

			again = k.nextLine();
			//reset game
			game.reset();
		}

		System.out.println("SCORES");
		System.out.println(player1.getPlayerIdentity() + ": " + player1.getScore());
		System.out.println(player2.getPlayerIdentity() + ": " + player2.getScore());
		k.close();
		game.exit();

	}

}
