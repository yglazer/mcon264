package yg;

public class Winner {

		private PlayField playfield;
		
		public Winner(PlayField playfield) {
			this.playfield = playfield;
		}
		
		
		//all winner combinations 
		
		public PlayerIdentity checkForLine() {
			String [] stringBoard = Display.swapToNumbers(playfield.getBoard());
			String line = null;
			for (int i = 0; i < 8; i++ ) {
				switch (i) {
				case 0: 
					line = stringBoard[0] + stringBoard[1] + stringBoard[2];
					break;
				case 1: 
					line = stringBoard[3] + stringBoard[4] + stringBoard[5];
					break;
				case 2: 
					line = stringBoard[6] + stringBoard[7] + stringBoard[8];
					break;
				case 3: 
					line = stringBoard[0] + stringBoard[3] + stringBoard[6];
					break;
				case 4: 
					line = stringBoard[2] + stringBoard[5] + stringBoard[8];
					break;
				case 5: 
					line = stringBoard[1] + stringBoard[4] + stringBoard[7];
					break;
				case 6: 
					line = stringBoard[0] + stringBoard[4] + stringBoard[8];
					break;
				case 7: 
					line = stringBoard[2] + stringBoard[4] + stringBoard[6];
					break;
				}
				if ("xxx".equals(line)) {
					return PlayerIdentity.x;
				}else if ("ooo".equals(line)) {
					return PlayerIdentity.o;
				}
				}
			return null;
			}
		}

