package pattern;

public class StarPatternEx2 {

//	 *****
//	 *****
//	 *****
//	 *****
//	 *****

	public static void main(String[] args) {

		// loop i is outer loop and j is inner loop to print

		int num = 5;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {

				System.out.print("*");

			}
			System.out.println(" ");

		}
	}

}
