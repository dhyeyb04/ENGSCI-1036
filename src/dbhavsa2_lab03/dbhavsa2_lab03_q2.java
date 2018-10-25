package dbhavsa2_lab03;

import java.util.Scanner;

public class dbhavsa2_lab03_q2 {

	public static double computePower(double base, int power) {
		double result = 1;
		if (power > 0) {
			for(int i = 1; i <= power; i++) {
				result *= base;
			}
		}
		else if (power < 0) {
			for(int i = -1; i >= power; i--) {
				result *= base;
			}
			result = 1/result;
		}
		else {
			result = 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int N =1000;
		Double x;
		char yn;
		
		//Keeps looping based on user choice
		do{
			//Prompts user and calculates result
			Double total = 0.0;
			
			do {
			System.out.println("Enter a value to compute the inverse tangent (-1 to 1): ");
			x = inputScanner.nextDouble();
			
			//Ensures input value is in domain of function
			if (x < -1 || x > 1)
				System.out.println("Incorrect input!");
			} while (x < -1 || x > 1);

			//Calculate inverse tangent
			for (int n = 0; n <= N; n++) {
				double currentValue = (computePower(x, 2*n+1))/(2*n+1);
				//Due to (−1)^n, when n is even, it will add to previous value, else subtract
				if (n % 2 == 0) {
					total += currentValue;
				}
				else {
					total += -currentValue;
				}
			}
			
			System.out.println("The result is " + total);
			
			//Ask if user would like to loop again
			System.out.println("Would you like to continue? (y/n): ");
			yn = inputScanner.next().charAt(0);
		} while (yn == 'y');
		
		System.out.println("Goodbye!");
		inputScanner.close();
	}

}
