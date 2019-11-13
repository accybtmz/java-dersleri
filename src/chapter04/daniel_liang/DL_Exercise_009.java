package chapter04.daniel_liang;

import java.util.Scanner;

public class DL_Exercise_009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		// Display Unicode of character
		System.out.println((int) ch);
	}
}
