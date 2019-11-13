package chapter03.java_egitim;

/*
 * Dışarıdan a, b, c kenarları girilen bir üçgenin eşkenar, ikizkenar veya
çeşitkenar olup olmadığını gösteren program yazınız.
 * */
public class JE_Alistirma_001 {

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		int c = 10;

		if (a == b && b == c) {
			System.out.println("Eşkenar");
		} else if (a == b || a == c || b == c) {
			System.out.println("İkizkenar");
		} else
			System.out.println("Çeşitkenar");
	}

}
