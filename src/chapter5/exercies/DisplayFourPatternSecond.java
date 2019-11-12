package chapter5.exercies;

/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class DisplayFourPatternSecond {
	public static void main(String[] args) {
		// Display pattern B
		System.out.println("Pattern B");
		for (int r = 6; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
