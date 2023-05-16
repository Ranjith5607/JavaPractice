package pattern;

public class StarPatternEx6 {

//    *
//   **
//  ***
// ****
//*****  //one 
// ****  //two
//  ***
//   **
//    *

	public static void main(String[] args) {

		// loop i is outer loop and j is inner loop to print

		int num = 5;

		// outer loop1
		for (int i = 1; i <= num; i++) {

			// for printing space
			for (int j = num; j > i; j--) {

				System.out.print(" ");

			}

			// for printing star
			for (int k = 1; k <= i; k++) {

				System.out.print("*");

			}

			System.out.println(" ");

		}

		// loop2

		for (int i = 1; i <= num; i++) {

			// for space
			for (int j = 1; j <= i; j++) {

				System.out.print(" ");

			}

			// for printing
			for (int j = 1; j <= num - i; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}
