package chapter01.alistirmalar;

public class ShowLogicErrors {

	public static void main(String[] args) {

		System.out.println("Celsius is fahreneit degree");
		System.out.println((9 / 5) * 35 + 32); // answer is 67 but, answer shold be 95

		// for correct answer
		System.out.println("The correct result is : " + ((9 / 5.0) * 35 + 32));
	}

}
