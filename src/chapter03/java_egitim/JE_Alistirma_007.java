package chapter03.java_egitim;

/*
 * case break ile kesilmemesi durumunda break bulana kadar bir sonraki case e
geçerek çalışmaya devam eder.
 * */
public class JE_Alistirma_007 {

	public static void main(String[] args) {

		int n = 1;

		switch (n) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			break;
		}
	}

}
