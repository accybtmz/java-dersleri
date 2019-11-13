package chapter04.daniel_liang;

import java.util.Scanner;

/*
(Process a string) Write a program that prompts the user to enter a string and displays
its length and its first character.
*/
public class DL_Exercise_020 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a sting: ");
		String str = input.nextLine();

		// Display the string's length and its first character
		System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
	}

}
