package pattern;

public class StarPatternEx1 {

//	 *
//	 **
//	 ***
//	 ****
//	 *****

	public static void main(String[] args) {

		// loop i is outer loop and j is inner loop to print

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println(" ");


		}
	}

}
