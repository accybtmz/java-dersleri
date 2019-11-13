package chapter02.java_egitim;

/*
 * Ondalıklı sayılarda virgülden sonraki kısım ile ilgili örnekler
 * */
public class JE_Alistirma_008 {

	public static void main(String[] args) {

		// Bir sayının virgülden sonraki kısmını bulan program yazınız
		double a = 12.71945;
		System.out.println(a - (int) a);

		// Bir sayıyı virgülden sonra iki hane olacak şekle getiren program yazınız
		System.out.println((int) (a * 100) / 100.0);

	}
}
