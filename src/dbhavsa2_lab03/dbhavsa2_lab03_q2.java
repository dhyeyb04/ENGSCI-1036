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
		int n =100;
		Double x, num, denom, total = 0.0;
		String yn;
		
		do{
			System.out.println("Enter a value to compute the inverse tangent (-1 to 1): ");
			x = inputScanner.nextDouble();
			
			do {
				System.out.println("Incorrect input!");
			} while (x < 1 && x > -1);
			
			for (int i=0; i == n; i++) {
				num = (computePower(-1, n) * (computePower(x, (2*n)+1)));
				denom = (double) (2*n)+1;
				total += num/denom;
			}
			
			/*if (x < 1 && x > -1) {
				for (int i=0; i == n; i++) {
					num = (computePower(-1, n) * (computePower(x, (2*n)+1)));
					denom = (double) (2*n)+1;
					total += num/denom;
				}
			}
			else {
				System.out.println("Incorrect input!");
			}
			*/
						
			System.out.println("Would you like to continue? (y/n): ");
			yn = inputScanner.next();
		} while (yn.equals("y"));
		
		System.out.println("Goodbye!");
		inputScanner.close();
	}

}
