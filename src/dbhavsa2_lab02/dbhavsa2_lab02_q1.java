package dbhavsa2_lab02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class dbhavsa2_lab02_q1 {

	public static void main(String[] args) {
		//Instantiate variables
		Scanner inputScanner = new Scanner(System.in);
		int option;
		double cel, fer, cm, inch, m, ft, kmh, mph;
		DecimalFormat df = new DecimalFormat("###.####");
		
		//Opening statement
		System.out.println("******************************");
		System.out.println("ES1036: Lab 02 Q1");
		System.out.println("Date: October 3 2018");
		System.out.println("Name: Dhyey Bhasvar");
		System.out.println("Student Number: 251021048");
		System.out.println("Question 1");
		System.out.println("******************************");
		
		do {
		//Display options to user
		System.out.println("******************************");
		System.out.println("****** Value Conversion ******");
		System.out.println("******************************");
		System.out.println("*  1. Celsius -> Fahrenheit  *");
		System.out.println("*  2. Centimeters -> Inches  *");
		System.out.println("*  3. Meters -> Feet         *");
		System.out.println("*  4. Km/h -> MPH            *");
		System.out.println("*  5. Exit                   *");
		System.out.println("******************************");
		
		//Get a,b, and c values from user
		System.out.println("Please input a choice (1-5): ");
		option = inputScanner.nextInt();
		
		} while (option < 0 || option > 5);
			switch (option) {
			case 1: //Celsius -> Fahrenheit
				System.out.println("Please input a temperature in degrees celsius: ");
				cel = inputScanner.nextDouble();
				if (cel <= 0) {
					System.out.println("Ice may be possible, please be careful.");
				}
				else {
					fer = ((cel*9/5) + 32);
					System.out.println("The conversion is " + fer + " degrees Fahrenheit");
				}
				
			case 2: //Centimeters -> Inches
				do{
					System.out.println("Please input a length in centimeteres: ");
					cm = inputScanner.nextDouble();
				} while (cm < 0);
				inch = 0.39*cm;
				System.out.println("The conversion is " + df.format(inch) + " inches");
			
			case 3: //Meters -> Feet
				do{
					System.out.println("Please input a length in meters: ");
					m = inputScanner.nextDouble();
				} while (m < 0);
				ft = 3.28*m;
				System.out.println("The conversion is " + df.format(ft) + " feet");
			
			case 4: //Km/h -> MPH
				do{
					System.out.println("Please input a speed in Km/h: ");
					kmh = inputScanner.nextDouble();
				} while (kmh < 0 || 160 < kmh);
				mph = kmh/1.609;
				System.out.println("The conversion is " + df.format(mph) + " MPH");
			
			case 5: //Exit
				System.out.println("------------------------------");
				System.out.println("---------- Goodbye! ----------");
				System.out.println("------------------------------");
				inputScanner.close();
				break;
			}
	}

}
