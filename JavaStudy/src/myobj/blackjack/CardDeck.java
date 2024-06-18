package myobj.blackjack;

public interface CardDeck {
	Card[] cards = new Card[52];
	
	void shuffle();
	
	Card draw();
}
