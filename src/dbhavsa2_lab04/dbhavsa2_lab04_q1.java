package dbhavsa2_lab04;

import java.util.Scanner;

public class dbhavsa2_lab04_q1 {
	
	private static char displayMenu() {
		Scanner inputScanner = new Scanner(System.in);
		char choice;
		
		//Checks if user input is a valid selection and keeps asking until it is
		do {
			System.out.println("----------------------------"); 
			System.out.println("-- Calculator Application --");
			System.out.println("----------------------------"); 
			System.out.println("a. Power Function");
			System.out.println("b. Sine Function");
			System.out.println("c. Inverse Tangent Function");
			System.out.println("d. Exponential Function");
			System.out.println("e. Factorial Function");
			System.out.println("f. Exit");
			System.out.println("----------------------------");
			
			System.out.print("Please enter your choice: ");
			choice = inputScanner.next().charAt(0);
			
			if (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd' && choice != 'e' && choice != 'f') {
				System.out.println("Invalid selection!");
				System.out.println("");
			}
						
		} while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd' && choice != 'e' && choice != 'f');
		
		inputScanner.close();
		return choice;
	}
	
	static class Calculator{
		public static double power(double base, int exponent ) {
			double result = 1;
			//If positive power, step power up to input value
			if (exponent > 0) {
				for(int i = 1; i <= exponent; i++) {
					result *= base;
				}
			}
			//If negative power, step power down to input value
			else if (exponent < 0) {
				for(int i = -1; i >= exponent; i--) {
					result *= base;
				}
				//Negative exponent places value in denominator
				result = 1/result;
			}
			//Any base to exponent 0 = 1
			else {
				result = 1;
			}
			return result;
		}
		public static double tangent(double radians, int iterations ) {
			Double total = 0.0;
			
			for (int n = 0; n <= iterations; n++) {
				double currentValue = (power(radians, 2*n+1))/(2*n+1);
				//Due to (−1)^n, when n is even, it will add to previous value, else subtract
				if (n % 2 == 0) {
					total += currentValue;
				}
				else {
					total += -currentValue;
				}
			}
			return total;
		}
		public static double sine(double radians, int iterations ) {
			Double total = 0.0;
			
			for (int n = 0; n <= iterations; n++) {
				double currentValue = power(radians, 2*n+1)/factorial(2*n+1);
				//Due to (−1)^n, when n is even, it will add to previous value, else subtract
				if (n % 2 == 0) {
					total += currentValue;
				}
				else {
					total += -currentValue;
				}
			}
			return total;
		}
		public static double exponential(double exp, int iterations ) {
			Double result = 0.0;
			
			for (int n = 0; n <= iterations; n++) {
				result += (power(exp, n)/factorial(n));
			}
			return result;
		}
		public static double factorial(int value ) {
			double fact = 1;
			
			for (int x = 1; x <= value; x++) {
				fact *= x; //fact = previous factorial value * x value of for loop
			}
			return fact;
		}
	}
	
	public static void main(String[] args) {
		char option;
		Scanner inputScanner = new Scanner(System.in);
		
		do {
			//Runs the display menu method which returns the option as a char
			option = displayMenu();
			
			switch (option) {
			case 'a': //-----------------------------Power-----------------------------//
				System.out.print("Please enter a real number base: ");
				double base = inputScanner.nextDouble();
				System.out.print("Please enter an integer exponent: ");
				int exponent = inputScanner.nextInt();
				System.out.println("The result is: " + Calculator.power(base, exponent));
				break;
			case 'b': //-----------------------------Sine-----------------------------//
				System.out.print("Please enter a number in radians: ");
				double rad = inputScanner.nextDouble();
				System.out.print("Please enter the number of iterations: ");
				int iter = inputScanner.nextInt();
				System.out.println("The result is: " + Calculator.sine(rad, iter));
				break;
			case 'c': //---------------------------Inverse Tangent----------------------------//
				Double x;

				do {
					System.out.print("Enter a value to compute the inverse tangent (-1 to 1): ");
					x = inputScanner.nextDouble();

					//Ensures input value is in domain of function
					if (x < -1 || x > 1)
						System.out.println("Incorrect input!");
				} while (x < -1 || x > 1);

				System.out.print("Please enter the number of iterations: ");
				int iter1 = inputScanner.nextInt();
				System.out.println("The result is: " + Calculator.tangent(x, iter1));
				break;
			case 'd': //---------------------------Exponential---------------------------//
				System.out.print("Please enter a number for the exponential: ");
				double num = inputScanner.nextDouble();
				System.out.print("Please enter the number of iterations: ");
				int iter2 = inputScanner.nextInt();
				System.out.println("The result is: " + Calculator.exponential(num, iter2));
				break;
			case 'e': //--------------------------Factorial--------------------------//
				System.out.print("Please input a positive integer: ");
				int initial = inputScanner.nextInt();
				System.out.println("The result is: " + Calculator.factorial(initial));
				break;
			}
		} while (option != 'f'); //Once input option is f, exit the loop
		
		System.out.println("------------------------------");
		System.out.println("Goodbye!");
		System.out.println("------------------------------");
		inputScanner.close();
	}

}