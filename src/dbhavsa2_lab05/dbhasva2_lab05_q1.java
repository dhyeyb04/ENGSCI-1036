package dbhavsa2_lab05;

public class dbhasva2_lab05_q1 {
	public static void print(char a) {						//Print method for char inputs
		System.out.println("The character is " + a + ".");
	}

	public static void print(int b) {						//Print method for integer inputs
		System.out.println("The integer is " + b + ".");
	}

	public static void print(String c) {					//Print method for string inputs
		System.out.println("The string is " + c + ".");
	}

	public static void print(double d) {					//Print method for double inputs
		System.out.println("The double is " + d + ".");
	}

	public static void print(boolean e) {					//Print method for boolean inputs
		System.out.println("The boolean is " + e + ".");
	}

	public static void main(String[] args) {
		print(3);			//Initial call of print method
		print('f');			//Overload with char parameter instead of int
		print(4 > 3);		//Overload with boolean parameter instead of char
		print(9.81);		//Overload with double parameter instead of boolean
		print("great");		//Overload with string parameter instead of double
	}

}
