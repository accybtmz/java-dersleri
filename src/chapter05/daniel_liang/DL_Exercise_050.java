package chapter05.daniel_liang;

import java.util.Scanner;

/*
(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
*/
public class DL_Exercise_050 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		// Count the number of uppercase letters
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i)))
				count++;
		}

		// Display the results
		System.out.println("Tne number of uppercase letters is " + count);
	}
}
