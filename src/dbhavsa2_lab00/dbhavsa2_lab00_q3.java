package dbhavsa2_lab00;

import java.util.Scanner;

public class dbhavsa2_lab00_q3 {

	public static void main(String[] args) {
		//Instantiate variables
		double side1=0,side2=0,distance=0;
		Scanner inputScanner = new Scanner(System.in);
				
		System.out.println("Enter four double values for the coridantes of the triangle, ");
		System.out.println("x1: ");
		double x1 = inputScanner.nextDouble ();
		System.out.println("x2: ");
		double x2 = inputScanner.nextDouble ();
		System.out.println("y1: ");
		double y1 = inputScanner.nextDouble ();
		System.out.println("y2: ");
		double y2 = inputScanner.nextDouble ();
		inputScanner.close();
		
		//Find delta values
		side1 = x2-x1;
		side2 = y2-y1;
		
		//Pythagorean Formula solving for hypotenuse
		//side1*side1=side1^2, pow(base, exponent)
		distance = Math.sqrt(side1*side1 + Math.pow(side2, 2.0));
		
		//Convert the values to strings and output them
		System.out.println ("The perimeter of the triangle is " +
		Math.round(side1 + side2 + distance));
		
	}

}