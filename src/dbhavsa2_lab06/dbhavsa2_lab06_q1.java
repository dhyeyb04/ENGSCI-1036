package dbhavsa2_lab06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class dbhavsa2_lab06_q1 {
	static class ConsoleInput {
		// static Scanner scanner = new Scanner(System.in);
		public static int getValidatedInteger(int minValue, int maxValue) {
			Scanner intscanner = new Scanner(System.in);
			int i = 0;
			boolean correct = false;

			do {
				try {
					System.out.print("Please input an integer between 4 and 19 inclusive: ");
					i = intscanner.nextInt();

					if (i > maxValue || i < minValue) {
						System.out.println("Incorrect range!");
					}
					else if (i >= minValue && i <= maxValue) {
					 correct = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Incorrect format!");
					intscanner.nextLine(); // This is used to clear console

				}
				/*
				 * finally { if (correct == true) { intscanner.close(); } }
				 */
			} while (correct == false);
			return i;
		}

		public static double getValidatedDouble(double minValue, double maxValue) {
			Scanner doublescanner = new Scanner(System.in);
			double d = 0;
			boolean correct = false;

			do {
				try {
					System.out.print("Please input a double between -34.6 and 85.1 inclusive: ");
					d = doublescanner.nextDouble();

					if (d > maxValue || d < minValue) {
						System.out.println("Incorrect range!");
					} else if (d >= minValue && d <= maxValue) {
						correct = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Incorrect format!");
					doublescanner.nextLine(); // This is used to clear console

				}
				/*
				 * finally { if (correct == true) { doublescanner.close(); } }
				 */
			} while (correct == false);
			return d;
		}

		public static char getValidatedChar(char minChar, char maxChar) {
			Scanner charscanner = new Scanner(System.in);
			char c = ' ';
			boolean correct = false;

			do {
				try {
					System.out
							.print("Please input a character between " + minChar + " and " + maxChar + " inclusive: ");
					c = charscanner.next().charAt(0);

					if (c > maxChar || c < minChar) {
						System.out.println("Incorrect range!");
					} else if (c >= minChar && c <= maxChar) {
						correct = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Incorrect format!");
					charscanner.next(); // This is used to clear console
				}
				// finally {
				// if (correct == true) {
				// charscanner.close();
				// }
				// }
			} while (correct == false);
			return c;
		}

	}

	public static void main(String[] args) {
		ConsoleInput.getValidatedInteger(4, 19);
		ConsoleInput.getValidatedDouble(-34.6, 85.1);
		ConsoleInput.getValidatedChar('a', 'f');
	}

}
