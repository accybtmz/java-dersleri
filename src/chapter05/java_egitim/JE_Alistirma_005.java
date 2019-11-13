package chapter05.java_egitim;

/*
 * JE_AListirma_004'de ki örneğin farklı bir çözüm şekli 
 * 
 * */
public class JE_Alistirma_005 {

	public static void main(String[] args) {
		int n = 42672;
		int k = 1;
		while (n > 0) {
			System.out.print(k * (n % 10) + (n > 10 ? " + " : ""));
			k *= 10;
			n /= 10;
		}

	}

}
