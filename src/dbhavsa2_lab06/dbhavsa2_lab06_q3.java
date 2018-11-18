package dbhavsa2_lab06;

class Card {
	private int denomination;
	private char suit;

	public Card(int denomination, char suit) {
		this.denomination = denomination;
		this.suit = suit;
	}

	public String face() {
		String concat;

		if (denomination == 1) {
			concat = "A" + suit;
		} else if (denomination == 11) {
			concat = "J" + suit;
		} else if (denomination == 12) {
			concat = "Q" + suit;
		} else if (denomination == 13) {
			concat = "K" + suit;
		} else {
			concat = Integer.toString(denomination) + suit;
		}

		return concat;
	}
}

class Deck {
	public Card cards[] = new Card[52];
	private char suits[] = new char[4];
	private int denominations = 13;

	public Deck() {
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';

		for (int i = 1; i <= 4; i++) {
			for (int x = 1; x <= denominations; x++) {
				if (i == 1) {
					
				} else if (i == 2) {
					
				} else if (i == 3) {
					
				} else if (i == 4) {
					
				}
			}
		}
	}

	public void printCards() {

	}
}

public class dbhavsa2_lab06_q3 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.printCards();
	}

}
