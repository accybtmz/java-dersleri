package chapter02.java_egitim;

/*
 * Basamak Aritmetikleri
 * */
public class JE_Alistirma_004 {

	public static void main(String[] args) {

		// Bir sayının birler basamağını veren program
		int n = 2437;
		System.out.println(n % 10);

		// Bir sayının onlar basamağını veren program
		System.out.println(n / 10 % 10);

		// Bir sayının birler ve onlar basamağını yer değiştiren program
		System.out.println(n / 100 * 100 + n % 10 * 10 + n / 10 % 10);
	}
}
