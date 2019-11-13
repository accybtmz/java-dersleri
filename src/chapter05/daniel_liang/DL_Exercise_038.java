package chapter05.daniel_liang;

import java.util.Scanner;

/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
*/
public class DL_Exercise_038 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter a decimal integer
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();

		// Convet decimal to octal
		String octal = ""; // Hold octal value
		for (int i = decimal; i > 0; i /= 8) {
			octal = i % 8 + octal;
		}

		// Display results
		System.out.println("The octal of " + decimal + " is " + octal);
	}
}
