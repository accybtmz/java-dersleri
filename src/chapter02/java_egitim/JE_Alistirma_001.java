package chapter02.java_egitim;

/*
 * Değişken tanımlama
 * */
public class JE_Alistirma_001 {

	public static void main(String[] args) {

		byte by = 128; // 128 byte veri tipinin sınırlarında değildir, bu yüzden derleme hatası verir.
		long lo = 14.0; // long veri tipine double bir değer atayamazsınız.
		float fl = -141; //
		char ch = "A"; // char veri tipine String bir değer atanmaz.

		byte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;

		s = b * 2; // integer short'a atanamaz
		c = c + b; // integer char'a atanamaz
		s = s + i; // integer short'a atanamaz
		b = (byte) s * b; // integer byte'a atanamz
		i = b * c;

		System.out.println();

	}

}
