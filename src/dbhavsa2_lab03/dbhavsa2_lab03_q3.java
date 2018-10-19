package dbhavsa2_lab03;

import java.util.Scanner;

public class dbhavsa2_lab03_q3 {
	
	static class Employee{
		private String m_firstName, m_lastName;
		private double m_salary;
		
		public Employee(){
	    }
		
		public Employee(String fName, String lName, double salary){
			m_firstName = fName;
			m_lastName = lName;
			m_salary = salary;
		}

		void printInfo(){
			System.out.println("First Name:" + m_firstName);
			System.out.println("Last Name:" + m_lastName);
			System.out.println("Salary:" + m_salary);
		}
	}
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter the employee’s first name: ");
		emp.m_firstName = inputScanner.next();
		
		System.out.println("Enter the employee’s last name: ");
		emp.m_lastName = inputScanner.next();
		
		System.out.println("Enter the employee’s salary: ");
		emp.m_salary = inputScanner.nextDouble();
				
		inputScanner.close();
		
		emp.printInfo();
	}

}