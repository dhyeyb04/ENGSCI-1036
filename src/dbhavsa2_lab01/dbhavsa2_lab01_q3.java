package dbhavsa2_lab01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class dbhavsa2_lab01_q3 {

	public static void main(String[] args) {
		//Instantiate variables
		double a, b, c, root1, root2, imagNum1 = 0;
		Scanner inputScanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.####");
		
		//Opening statement
		System.out.println("****************************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: September 27 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Program's mission: Solve a quadratic with the form");
		System.out.println("                   ax^2 + bx + c = 0");
		System.out.println("****************************************************");		
		
		//Get a,b, and c values from user
		System.out.println("Please input a: ");
		a = inputScanner.nextDouble();
		System.out.println("Please input b: ");
		b = inputScanner.nextDouble();
		System.out.println("Please input c: ");
		c = inputScanner.nextDouble();
		inputScanner.close();
				
		//Conditionals
		if (a == 0) {
			if (b != 0) { //One solution
				root1 = -c/b;
				System.out.println("The solution is: " + df.format(root1));
			}
			else if (b == 0 && c ==0) {//Zero solutions
				//root = 0;
				System.out.println("There are infinite number of solutions");
			}
			else //No solutions
				System.out.println("A solution does not exist!");
		}
		else {
			if ((b*b)-(4*a*c) >= 0) {//Two solutions
				root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
				root2 = (((-b) - Math.sqrt((b*b) - (4*a*c)))/(2*a));
				System.out.println("Your equation has real roots: " + df.format(root1) + " and " + df.format(root2) + ".");
			}
			else {//Complex solution
				root1 = ((-b)/(2*a));
				imagNum1 = Math.sqrt(((4*a*c) - (b*b)))/(2*a);
				System.out.println("Your equation has complex roots: " + root1 + " + " + df.format(imagNum1) + "i and " + root1 + " - " + df.format(imagNum1) + "i.");
			}
		}
	}
}