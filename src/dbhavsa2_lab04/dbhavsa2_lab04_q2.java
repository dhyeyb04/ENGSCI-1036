package dbhavsa2_lab04;

import java.util.Scanner;

public class dbhavsa2_lab04_q2 {	
	public static void main(String[] args) {
		WordGame game = new WordGame ();
	}

}

class WordGame{
	String input;
	static int len;
	int turns = 10;
	
	public static String getWord() {
		Scanner inputScanner = new Scanner(System.in);
					
		System.out.println("Enter a word to begin the game: ");
		String word = inputScanner.next();
		len = word.length();
		inputScanner.close();
		
		return word;
	}
	
	public static char[] makeStarArray() {
		char[] temp = new char[len]; //Store a temp array which will be displayed to the user
		
		for(int i = 0; i < temp.length; i++) //initialize the array
		{
		    temp[i] = '*';
		}
		
		//StringBuilder starWord = new StringBuilder(getWord());
		//int length = starWord.length();
		
		//for (int i = 0; i >= length; i++) {
		//	
		//}
		
		return temp;
	}
	
	public void guess(){
		char guessOption = ' ';
		Scanner inputScanner = new Scanner(System.in);
		
		do {
			System.out.print("Would you like to guess the word? (y/n): ");
			guessOption = inputScanner.next().charAt(0);
			
			if (guessOption == 'y') {
				System.out.println(guessOption);
				//guessString();			}
			}
			else if (guessOption == 'n') {
				System.out.println(guessOption);
				//guessChar();
			}
		} while(guessOption != 'y' && guessOption != 'n');
		
		inputScanner.close();
	}
	
	//public static String guessString(){
		
	//}
	
	//public static char guessChar(){
		
	//}
	
	public WordGame() {
		input = getWord();
		System.out.println(makeStarArray());
		guess();
	}
}