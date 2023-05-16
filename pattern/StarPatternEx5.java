package pattern;

public class StarPatternEx5 {

//	*****
//	-****
//	--***
//	---**
//	----*

	public static void main(String[] args) {

		// loop i is outer loop and j is inner loop to print

		int num = 5;

		// outer loop
		for (int i = 1; i <= num; i++) {

			// for printing space
			for (int j = 1; j<i; j++) {

				System.out.print(" ");

			}

			// for printing star
			for (int k = i; k <= num; k++) {

				System.out.print("*");

			}

			System.out.println(" ");

		}
	}

}
