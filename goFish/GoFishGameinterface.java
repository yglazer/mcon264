package goFish;

interface GoFishGameinterface extends Gameinterface {
	
	void startGame();
	
	boolean isGameOver();
	
	void playTurn(Player);
	
	void endGame();
}