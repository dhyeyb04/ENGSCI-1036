package dbhavsa2_lab03;

import java.util.Scanner;

public class dbhavsa2_lab03_q3 {
	
	//Create Employee class within dbhavsa2_lab03_q3 main class
	public static class Employee{
		public String m_firstName, m_lastName;
		public double m_salary;
		
		//Constructor to set class values as input values
		public Employee(String fName, String lName, double salary){
			m_firstName = fName;
			m_lastName = lName;
			m_salary = salary;
		}
		
		//Method to print out values
		private void printInfo(){
			System.out.println("First Name: " + m_firstName);
			System.out.println("Last Name: " + m_lastName);
			System.out.println("Salary: " + m_salary);
		}
	}
	
	public static void main(String[] args) {
		//Instantiate local variables
		Scanner inputScanner = new Scanner(System.in);
		String fName, lName;
		double sal;
		
		//Set local variables as input values
		System.out.println("Enter the employee’s first name: ");
		fName = inputScanner.next();
		
		System.out.println("Enter the employee’s last name: ");
		lName = inputScanner.next();
		
		System.out.println("Enter the employee’s salary: ");
		sal = inputScanner.nextDouble();
		
		inputScanner.close();
		//Call employee class and and create a new emp object with input values
		Employee emp = new Employee(fName, lName, sal);
		
		//Use Employee class printInfo method to output values
		emp.printInfo();
	}

}