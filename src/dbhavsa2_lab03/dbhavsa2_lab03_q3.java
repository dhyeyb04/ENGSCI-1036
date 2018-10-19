package dbhavsa2_lab03;

import java.util.Scanner;

public class dbhavsa2_lab03_q3 {
	
	public class Employee{
		String m_firstName, m_lastName;
		double m_salary;
		
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
		//Instantiate variables
		//String first = "", last = "";
		//double sal = 0.0;
		Scanner inputScanner = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter the employee’s first name: ");
		emp.m_firstName = inputScanner.next();
		//first = inputScanner.next();
		//emp.m_firstName = first;
		System.out.println("Enter the employee’s last name: ");
		emp.m_lastName = inputScanner.next();
		//last = inputScanner.next();
		//emp.m_lastName = last;
		System.out.println("Enter the employee’s salary: ");
		emp.m_salary = inputScanner.nextDouble();
		//sal = inputScanner.nextDouble();
		//emp.m_salary = sal;
		
		inputScanner.close();
		
		emp.printInfo();
	}

}