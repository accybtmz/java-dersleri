package _001Chapter1;

public class StaticMetodCall {

	public static void main(String[] args) {

		/*
		 * static olmayan metoları, static metotlar içerisinden doğrudan çağıramayız.
		 * Çağırmak için static metodun içerisinde, static olmayan metodun ait olduğu
		 * sınıftan bir nesne üretip o nesnenin üzerinden static olmayan metoda
		 * ulaşmamız gereklidir. static bir metod diğer statik metod içinde direk
		 * çağrılabilir. static olmayan bir metod içinde static olan bir metod direk
		 * çağrılabilir.
		 */
		StaticMetodCall smc = new StaticMetodCall(); //
		smc.yaz();
		oku();
	}

	void yaz() {

		System.out.println("yazıyorum...");
		oku();
	}

	static void oku() {

		System.out.println("okuyorum...");
	}

}
