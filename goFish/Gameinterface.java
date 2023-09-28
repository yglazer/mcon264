package goFish;

interface Gameinterface{
	
	void startGame();
	
	boolean isGameOver();
	
	void playTurn(Player);
	
	void endGame();
}