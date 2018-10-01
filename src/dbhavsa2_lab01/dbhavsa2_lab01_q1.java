package dbhavsa2_lab01;

import java.util.Scanner;

public class dbhavsa2_lab01_q1 {

	public static void main(String[] args) {
		//Instantiate variables
		int grade1, grade2, grade3, grade4, average;
		double weight1, weight2, weight3, weight4;
				
		//Opening statement
		System.out.println("****************************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: September 27 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Program's mission: This program calculates a");
		System.out.println("                   weighted average of four grades");
		System.out.println("****************************************************");
				
		//Get grades and respective weights from user
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Input the first grade:");
		grade1 = inputScanner.nextInt();
		System.out.println("Input the first grade weight:");
		weight1 = inputScanner.nextDouble();
		System.out.println("Input the second grade:");
		grade2 = inputScanner.nextInt();
		System.out.println("Input the second grade weight:");
		weight2 = inputScanner.nextDouble();
		System.out.println("Input the third grade:");
		grade3 = inputScanner.nextInt();
		System.out.println("Input the third grade weight:");
		weight3 = inputScanner.nextDouble();
		System.out.println("Input the fourth grade:");
		grade4 = inputScanner.nextInt();
		System.out.println("Input the fourth grade weight:");
		weight4 = inputScanner.nextDouble();
		inputScanner.close();
		
		//Calculate final grade based on grades and weights
		average = (int) ((grade1*weight1) + (grade2*weight2) + (grade3*weight3) + (grade4*weight4));
		
		//Print out final grade
		System.out.println("The course grade is: " + average);
	}

}