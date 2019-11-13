package chapter05.java_egitim;

/*
 * Dışarıdan girilen bir sayının dijitlerini yanyana iki aynı dijit gelmeyecek
 * şekilde ekrana yazan bir program oluşturunuz. Örneğin 5640034441 sayısı
 * için sonuç 5640341 olmalıdır

 * */
public class JE_Alistirma_006 {

	public static void main(String[] args) {

		long n = 5640034441L;
		long eski_k = -1;
		String str = "";

		while (n > 0) {

			long k = n % 10;
			if (eski_k != k) {
				str = k + str;
				eski_k = k;
			}

			n /= 10;

		}

		System.out.println(str);
	}

}
