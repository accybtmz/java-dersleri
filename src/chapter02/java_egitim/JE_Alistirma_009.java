package chapter02.java_egitim;

/*
 * Veri tipi cast örnek
 * */
public class JE_Alistirma_009 {

	public static void main(String[] args) {

		// Aşağıdaki ifade derleme (compile) hatası üretmektedir, niçin? Bu problemi
		// nasıl çözebiliriz? (c değişkeninin short olarak kalması gerekmektedir)
		// short c = (short)a * b + 1;

		byte a = 5;
		short b = 300;
		short c = (short) ((short) a * b + 1);

	}
}
