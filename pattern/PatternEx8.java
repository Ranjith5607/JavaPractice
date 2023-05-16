package pattern;

public class PatternEx8 {

//1
//12
//1 3
//1  4
//12345

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				if (j == i || j == 1 || i == num) {
					System.out.print(j);

				} else {
					System.out.print(" ");

				}

			}

			System.out.println();

		}

	}

}
