package chapter05.java_egitim;

/*
 * Birbirinden farklı dijitlerden oluşmuş bir n sayının en büyük ve en küçük
dijitler haricinde kalan dijitlerin toplamını ve aritmetiksel ortalamasını bulan
program yazınız.
 * */
public class JE_Alistirma_003 {

	public static void main(String[] args) {

		int n = 378216;
		int enKucuk = 10;
		int enBuyuk = -1;
		int toplam = 0;
		int adet = 0;

		while (n > 0) {

			int sayi = n % 10;
			toplam += sayi;
			adet++;

			if (sayi > enBuyuk) {
				enBuyuk = sayi;
			}
			if (sayi <= enKucuk) {
				enKucuk = sayi;
			}

			n /= 10;

		}

		System.out.println(
				"En Küçük ve en Büyük değerler hariç kalan digitlerin toplamı " + (toplam - enBuyuk - enKucuk));

		System.out.println("Bütün digitlerin Arithmetic Ortalaması" + ((double) toplam / (double) adet));
	}

}
