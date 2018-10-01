package dbhavsa2_lab01;

import java.util.Scanner;

public class dbhavsa2_lab01_q2 {

	public static void main(String[] args) {
		//Instantiate variables
		char ch, uch;
		Scanner inputScanner = new Scanner(System.in);
		
		//Opening statement
		System.out.println("****************************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: September 27 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Program's mission: Convert a lowercase character");
		System.out.println("                   to its uppercase variant");
		System.out.println("****************************************************");
		
		//Get lowercase character from user
		System.out.println("Input a character: ");
		ch = inputScanner.next().charAt(0);
		inputScanner.close();
		
		//Lowercase to uppercase
		uch = (char)(ch - 32);
		
		//Outputting character to user
		System.out.println("The uppercase character is: " + uch);
	}

}