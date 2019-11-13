package chapter02.java_egitim;

/*
 * implict ve explict tip dönüşüm örnekleri
 * */
public class JE_Alistirma_007 {

	public static void main(String[] args) {

		int a = 2;
		double b = 5.0;
		System.out.println(a + b);
		System.out.println(a + (int) b);

		// Java da byte ve short veri tipleri işlem sırasında otomatik int'e çevrilir.
		byte x = 100;
		short s = 20;
		int c = x * s;
		System.out.println(c);
	}

}
