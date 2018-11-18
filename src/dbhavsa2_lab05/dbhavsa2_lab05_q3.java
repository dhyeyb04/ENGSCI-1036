package dbhavsa2_lab05;

import java.util.Scanner;

class Rectangle {
	private double side1;
	private double side2;

	public Rectangle(double x1, double y1, double x2, double y2) { // Sets side lengths based on (x,y) coordinates
																	// provided
		side1 = x2 - x1;
		side2 = y2 - y1;
	}

	public void scale(double scale) { // Changes length of sides based on input
		side1 *= scale;
		side2 *= scale;
	}

	public void print() {
		for (int i = 1; i <= side1; i++) { // Runs through rows
			for (int j = 1; j <= side2; j++) { // Runs through columns
				if (i == 1 || i == side1 || j == 1 || j == side2) { // Only prints out if top/bottom line or edges
					System.out.print("*");
				} else {
					System.out.print(" "); // Creates hollow square
				}
			}
			System.out.print("\n");
		}
	}
}

public class dbhavsa2_lab05_q3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double x1, x2, y1, y2;
		char choice;

		System.out.println("** Rectangle **");
		System.out.print("Please enter x1: ");
		x1 = inputScanner.nextDouble();
		System.out.print("Please enter y1: ");
		y1 = inputScanner.nextDouble();
		System.out.print("Please enter x2: ");
		x2 = inputScanner.nextDouble();
		System.out.print("Please enter y2: ");
		y2 = inputScanner.nextDouble();
		Rectangle rect = new Rectangle(x1, y1, x2, y2); // Creates new Rectangle object

		do {
			System.out.println("");
			System.out.println("a. Scale");
			System.out.println("b. Print");
			System.out.println("c. Exit");
			System.out.print("Please enter a choice: ");
			choice = inputScanner.next().charAt(0);
			System.out.println("");

			do {
				if (choice == 'a') { // Calls and sets scale according to input
					System.out.print("Please enter a scale: ");
					double sca = inputScanner.nextDouble();

					rect.scale(sca);
				} else if (choice == 'b') { // Calls print function
					rect.print();
				} else if (choice == 'c') { //Exits loops
					System.out.print("Goodbye!");
					break;
				}
			} while (choice <= 'a' && choice >= 'c');

			if (choice == 'c') {
				break;
			}
		} while (choice >= 'a' && choice <= 'c');
		inputScanner.close();
	}

}
