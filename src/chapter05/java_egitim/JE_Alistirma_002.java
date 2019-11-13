package chapter05.java_egitim;

/*
 * n değişkeni içindeki integer sayıyı integer k değişkenine tersten olacak
şekilde aktarınız ve daha sonra k değişkenin değerini ekrana yazdırınız.
Örneğin n = 53961 için k = 16935 olmalıdır.
 * */
public class JE_Alistirma_002 {

	public static void main(String[] args) {

		int n = 53961;
		int k = 0;
		while (n > 0) {
			k = k * 10 + n % 10;
			n /= 10;
		}

		System.out.println(k);
	}

}
