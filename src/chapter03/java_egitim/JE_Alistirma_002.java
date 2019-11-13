package chapter03.java_egitim;

/*
 * Short Circuit Kısa Devre
 * Kodun daha verimli çalışması için && ve || operatörleri kısa-devre olarak
çalışır. Örneğin L1 || L2 ifadesinde L1 true ise L2 ne olursa olsun sonuç true
olacaktır, dolayısı ile L2 ye bakmaya gerek yoktur. L1 && L2 ifadesinde ise L1
false ise L2 ne olursa olsun sonuç false olacaktır dolayısıyla L2 ye bakmaya
gerek yoktur. Bazen kısa-devre yapılmasını istemediğimiz durumlar olur. Böyle
durumlarda && yerine & ve || yerine | operatörlerini kullanınız.
 * */
public class JE_Alistirma_002 {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		if (++a >= b || b-- % 2 == 0) {
			b = -b;
		}
		System.out.println(a);
		System.out.println(b);

		int c = 2;
		int d = 3;
		if (c++ >= d || d-- % 2 == 0) {
			d = -d;
		}
		System.out.println(c);
		System.out.println(d);
	}
}
