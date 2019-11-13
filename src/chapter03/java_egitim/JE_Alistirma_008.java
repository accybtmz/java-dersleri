package chapter03.java_egitim;

/*
 * Girilen yıl ve ay için ayın kaç gün çektiğini bulan program yazınız.
int ay = 2, yil = 2000, gunAdedi = 0;
 * */
public class JE_Alistirma_008 {

	public static void main(String[] args) {

		int ay = 2;
		int yil = 2019;
		int gunAdedi = 0;

		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			gunAdedi = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			gunAdedi = 30;
			break;
		case 2:
			gunAdedi = ((yil % 4 == 0)) ? 29 : 28;
			break;
		default:
			System.out.println("Geçersiz ay.");
			break;
		}

		System.out.println("Girmiş olduğunuz ay " + yil + " yili için " + gunAdedi + " gün çekmektedir");
	}

}
