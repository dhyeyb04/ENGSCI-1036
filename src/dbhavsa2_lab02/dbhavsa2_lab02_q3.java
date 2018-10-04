package dbhavsa2_lab02;
import java.util.Scanner;

public class dbhavsa2_lab02_q3 {

	public static void main(String[] args) {
		//Instantiate variables
		Scanner inputScanner = new Scanner(System.in);
		int input, fact = 1;
		
		//Opening statement
		System.out.println("******************************");
		System.out.println("ES1036: Lab 02 Q3");
		System.out.println("Date: October 4 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Question 3");
		System.out.println("******************************");
		
		//Make sure input is greater than or equal to 0
		do{
			System.out.println("Input an integer number to calculate its factorial: ");
			input = inputScanner.nextInt();
		} while (input < 0);
		for (int x = 1; x <= input; x++) {
			fact *= x; //fact = previous factorial value * x value of for loop
		}
		System.out.println("The resulting factorial is: " + fact);
		inputScanner.close();
	}

}
