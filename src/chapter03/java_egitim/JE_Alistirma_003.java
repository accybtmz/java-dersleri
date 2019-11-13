package chapter03.java_egitim;
/*
 * Dışarıdan girilen bir sayının işaretini ver program
 * */

import java.util.Scanner;

public class JE_Alistirma_003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz :");
		int sayi = input.nextInt();

		if (sayi > 0) {
			System.out.println("pozitif(+)");
		} else if (sayi < 0) {
			System.out.println("negatif(-)");
		} else
			System.out.println("nötr(0)");
	}

}
