package chapter04.daniel_liang;

/*
(Random character) Write a program that displays a random uppercase letter
using the Math.random() method.
*/
public class DL_Exercise_016 {
	public static void main(String[] args) {
		// Generate a random number between 65 and 90
		int number = 65 + (int) (Math.random() * (91 - 65));

		// Display a random uppercase letter
		System.out.println((char) (number));
	}
}
