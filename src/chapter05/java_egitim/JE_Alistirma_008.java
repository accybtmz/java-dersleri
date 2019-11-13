package chapter05.java_egitim;

/*
 * Bir n sayısını iki ayrı sayıya ayırarak bu sayıların çarpımını döndüren
program yazınız. Sayıların çift adet basamak sayısından oluştuğunu
varsayınız.
Örnek: 5183  31 * 85 = 2635,
342732  274 * 323 = 88502
 * */
public class JE_Alistirma_008 {

	public static void main(String[] args) {

		int n = 5183;
		int basamak = 1;
		int sayi1 = 0;
		int sayi2 = 0;

		while (n > 0) {
			int k = n % 10;
			if (basamak % 2 == 1) {
				sayi1 = k + (sayi1 * 10);
			} else
				sayi2 = k + (sayi2 * 10);

			basamak++;

			n /= 10;
		}

		System.out.println("sayi1 : " + sayi1 + " sayi2 :" + sayi2);
		System.out.println(sayi1 * sayi2);

	}

}
