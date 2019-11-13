package chapter05.java_egitim;

/*
 * Dışarıdan girilen bir sayının basamak adedini bulan program yazınız.
 * */
public class JE_Alistirma_001 {

	public static void main(String[] args) {

		int n = 175;
		int i = 0;
		while (n > 0) {
			n /= 10;
			i++;
		}

		System.out.println(i);
	}

}
