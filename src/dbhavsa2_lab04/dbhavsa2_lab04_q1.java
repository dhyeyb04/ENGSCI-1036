package dbhavsa2_lab04;

import java.util.Scanner;

public class dbhavsa2_lab04_q1 {
	
	private static char displayMenu() {
		char choice;
		//char[] option = {'a', 'b', 'c', 'd', 'e'};
		
		do {
			//choice = ' ';
		
			System.out.println("----------------------------"); 
			System.out.println("-- Calculator Application --");
			System.out.println("----------------------------"); 
			System.out.println("a. Power Function");
			System.out.println("b. Sine Function");
			System.out.println("c. Tangent Function");
			System.out.println("d. Exponential Function");
			System.out.println("e. Factorial Function");
			System.out.println("f. Exit");
			System.out.println("----------------------------");
			
			Scanner inputScanner = new Scanner(System.in);
			System.out.print("Please enter your choice: ");
			choice = inputScanner.next().charAt(0);
			inputScanner.close();
			
			if (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd' && choice != 'e' && choice != 'f') {
				System.out.println("Invalid selection!");
			} else {
				System.out.println(choice);
			}
						
		} while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd' && choice != 'e' && choice != 'f');
		System.out.println(choice);
		
		return choice;
	}
	
	public static void main(String[] args) {
		displayMenu();
	}

}