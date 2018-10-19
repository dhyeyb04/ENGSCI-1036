package dbhavsa2_lab03;

import java.util.Scanner;

public class dbhavsa2_lab03_q1 {
	
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
		//Instantiate variables
		Scanner inputScanner = new Scanner(System.in);
		double base;
		int power;
		
		//Opening statement
		System.out.println("******************************");
		System.out.println("ES1036: Lab 03 Q1");
		System.out.println("Date: October 17 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Question 1");
		System.out.println("******************************");
		
		System.out.println("Please enter a real number base: ");
		base = inputScanner.nextDouble();
		System.out.println("Please enter an integer exponent: ");
		power = inputScanner.nextInt();
		
		System.out.println("The result is: " + computePower(base, power));
		inputScanner.close();
	}

}
