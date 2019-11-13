package chapter05.java_egitim;

/*
 * Bir n sayısının basamaklarını çözümleyen program yazınız
 * Örneğin n = 42672 için ekrana
 * 2 + 70 + 600 + 2000 + 40000 yazdırılacaktır
 * **/
public class JE_Alistirma_004 {

	public static void main(String[] args) {

		int n = 42672;
		int basamakDegeri = 1;
		int sayi = 0;
		while (n > 0) {

			sayi = basamakDegeri * (n % 10);
			basamakDegeri *= 10;
			n /= 10;
			if (n > 1)
				System.out.print(sayi + " + ");
			else
				System.out.print(sayi + " ");

		}

	}

}
