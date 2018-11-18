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

		if (this.denomination == 1) {
			concat = "A" + this.suit;
		} else if (this.denomination == 11) {
			concat = "J" + this.suit;
		} else if (this.denomination == 12) {
			concat = "Q" + this.suit;
		} else if (this.denomination == 13) {
			concat = "K" + this.suit;
		} else {
			concat = Integer.toString(this.denomination) + this.suit;
		}

		return concat;
	}
}

class Deck {
	public Card cards[] = new Card[52];
	private char suits[] = new char[4];
	private int denominations = 13;
	int counter = 0;

	public Deck() {
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';

		for (char C : suits) {
			for (int x = 1; x <= denominations; x++) {
				cards[counter] = new Card(x, C);
				counter++;
			}
		}
		counter = 0;
	}

	public void printCards() {
		for (char C : suits) {
			for (int x = 1; x <= denominations; x++) {
				if (x != 13) {
					System.out.print(cards[counter].face() + ", ");
					counter++;
				} else {
					System.out.print(cards[counter].face());
					counter++;
				}
			}
			System.out.println("");
		}
	}
}

public class dbhavsa2_lab06_q3 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.printCards();
	}

}
