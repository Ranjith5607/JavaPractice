package pattern;

public class StarPatternEx7 {

//	*--------*
//	**------**
//	***----***
//	****--****
//	**********

	public static void main(String[] args) {

		// loop i is outer loop and j is inner loop to print

		int num = 5;

		// outer loop
		for (int i = 1; i <= num; i++) {

			// printing star
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			// printing space
			for (int k = num; k > i; k--) {

				System.out.print("-" + "-");

			}

			// printing star
			for (int l = 1; l <= i; l++) {

				System.out.print("*");

			}

			System.out.println(" ");

		}

	}

}
