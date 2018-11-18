package dbhavsa2_lab06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dbhavsa2_lab06_q2 {

	public static void main(String[] args) {
		int num, grade, finalGrade = 0;
		double totalWeight = 0.0;

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("How many assignments would you like to compute?");
		num = inputScanner.nextInt();
		System.out.println(" ");

		int[] gradeArray = new int[num];
		double[] weightArray = new double[num];

		for (int i = 1; i <= num; i++) {
			do {
				try {
					System.out.print("Input grade " + i + " (0-100): ");
					gradeArray[i - 1] = inputScanner.nextInt();

					if (gradeArray[i - 1] < 0 || gradeArray[i - 1] > 100) {
						System.out.println("Incorrect range!");
					}
				} catch (InputMismatchException e) {
					System.out.println("Incorrect format!");
					inputScanner.nextLine(); // This is used to clear console

				}
			} while (gradeArray[i - 1] < 0 || gradeArray[i - 1] > 100);

			do {
				try {
					System.out.print("Input the grade " + i + " weight (0.0-1.0): ");
					weightArray[i - 1] = inputScanner.nextDouble();

					if (weightArray[i - 1] < 0.0 || weightArray[i - 1] > 1.0) {
						System.out.println("Incorrect range!");
					}

					totalWeight += weightArray[i - 1];
				} catch (InputMismatchException e) {
					System.out.println("Incorrect format!");
					inputScanner.nextLine(); // This is used to clear console
				}

			} while (weightArray[i - 1] < 0.0 || weightArray[i - 1] > 1.0);

			if (i == num) {
				while (totalWeight != 1) {
					totalWeight = 0.0;
					System.out.println(" ");
					System.out.println("Total weight does not equal 1!");
					System.out.println("Please enter all weights again.");
					System.out.println(" ");

					for (int x = 1; x <= num; x++) {
						try {
							System.out.print("Input the grade " + x + " weight (0.0-1.0): ");
							weightArray[x - 1] = inputScanner.nextDouble();

							if (weightArray[x - 1] < 0.0 || weightArray[x - 1] > 1.0) {
								System.out.println("Incorrect range!");
							}

							totalWeight += weightArray[x - 1];
						} catch (InputMismatchException e) {
							System.out.println("Incorrect format!");
							inputScanner.nextLine(); // This is used to clear console
						}
					}

				}
			}

			finalGrade += (gradeArray[i - 1] * weightArray[i - 1]);
		}

		System.out.println("The course grade is: " + finalGrade);
	}
}
