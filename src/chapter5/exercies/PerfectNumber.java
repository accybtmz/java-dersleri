package chapter5.exercies;

import java.util.Scanner;

/*
(Perfect number) A positive integer is called a perfect number if it is equal to
<<<<<<< HEAD
the sum of all of its positive divisors, excluding itself. For example, 6 is the
first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
There are four perfect numbers less than 10,000. Write a program to find all
*/
public class PerfectNumber {

	public static void main(String[] args) {
		int i, Number, Sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		Number = input.nextInt();

		for (i = 1; i < Number; i++) {
			if (Number % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		} else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}

	}

}
