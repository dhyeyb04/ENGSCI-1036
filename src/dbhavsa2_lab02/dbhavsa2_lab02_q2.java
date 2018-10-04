package dbhavsa2_lab02;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class dbhavsa2_lab02_q2 {

	public static void main(String[] args) {
		//Instantiate variables
		Scanner inputScanner = new Scanner(System.in);
		int loops, int1, total = 0, max = 0, min = 0, even = 0, odd = 0;
		double mean;
		
		//Opening statement
		System.out.println("******************************");
		System.out.println("ES1036: Lab 02 Q2");
		System.out.println("Date: October 4 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Question 2");
		System.out.println("******************************");
		
		//Ask for input till a positive integer is received
		do{
			System.out.println("Enter an integer number for the number of loop iterations: ");
			loops = inputScanner.nextInt();
			System.out.println("");
		} while (loops < 0);
		
		//Execute program as per user input
		for (int x = 1; x <= loops; x++) {
			System.out.println("Enter integer " + x + ": ");
			int1 = inputScanner.nextInt();
			total += int1;
			
			//Calculations
			mean = (double) total/x;
			//Max and Min allocation
			if (x == 1){
				max = int1;
				min = int1;
			}
			else {
				if (int1 > max) {
					max = int1;
				}
				else if (int1 < min) {
					min = int1;
				}
			}
			
			//Even and odd count
			if (int1 % 2== 0) {
				even ++;
			}
			else {
				odd ++;
			}
			
			//Output values
			System.out.println("The mean of " + x + " input(s) is: " + mean);
			System.out.println("Max value: " + max);
			System.out.println("Min value: " + min);
			System.out.println("Even count: " + even);
			System.out.println("Odd count: " + odd);
			System.out.println("");
		}
		inputScanner.close();
	}

}
