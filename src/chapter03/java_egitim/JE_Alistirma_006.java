package chapter03.java_egitim;

import java.util.Scanner;

/*
 * Bir kişinin kilosu ve boyu girildiğinde yorum yapan programı yazınız.
BMI = Kilo / Boy^2
 * */
public class JE_Alistirma_006 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen kişinin metre cinsinden boyunu giriniz :");
		double boy = input.nextDouble();
		System.out.println("Lütfen kişinin kilogram cinsinden ağırlığını giriniz :");
		int kilo = input.nextInt();

		double BMI = kilo / (boy * boy);
		System.out.println("BMI değeriniz :" + BMI);

		if (BMI < 18.5) {
			System.out.println("ZAYIF");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("NORMAL KİLOLU");

		} else if (BMI >= 25 && BMI <= 29.9) {
			System.out.println("FAZLA KİLOLU");

		} else if (BMI >= 30 && BMI <= 39.9) {
			System.out.println("ŞİŞMAN/OBEZ");
		} else if (BMI > 40) {
			System.out.println("AŞIRI ŞİŞMAN / AŞIRI OBEZ");

		}
	}

}
