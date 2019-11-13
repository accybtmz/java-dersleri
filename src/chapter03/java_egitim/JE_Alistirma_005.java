package chapter03.java_egitim;

/*
 * Aşağıdaki program parçacığı ekran ne yazdırır
 * */
public class JE_Alistirma_005 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;

		if (a < b | ++a == c)
			System.out.println(a);
		a *= 2;
		System.out.println(a);
	}

}
