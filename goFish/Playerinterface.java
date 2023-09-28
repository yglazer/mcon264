package goFish;

interface Playerinterface{
	
	String getName();

	List<Card> getHand();
	
	void addToHand(Card card);
	
	void play();
}