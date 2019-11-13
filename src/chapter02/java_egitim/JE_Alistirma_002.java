package chapter02.java_egitim;

/*
 * ++ ya da -- operatörlerinin işlem önceliğinde nasıl davrandığını gösteren örnek
 * */
public class JE_Alistirma_002 {

	public static void main(String[] args) {

		int a = 2;
		int b = a++ * 2;
		System.out.println(a);
		System.out.println(b);
	}

}
