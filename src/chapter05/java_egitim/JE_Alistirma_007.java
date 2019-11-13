package chapter05.java_egitim;

/*
 * Bir n sayısının dijitleri tek ise yanına 1 çift ise yanına 2 ekleyen
 * program yazınız
 * */
public class JE_Alistirma_007 {

	public static void main(String[] args) {

		int n = 6725;
		int k = 0;
		String str = "";
		while (n > 0) {

			k = n % 10;
			if (k % 2 == 0) {
				str = k + "2" + str;
			} else {
				str = k + "1" + str;
			}

			n /= 10;
		}

		System.out.println(str);
	}

}
