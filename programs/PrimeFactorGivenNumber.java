package programs;

public class PrimeFactorGivenNumber {

	public static void main(String[] args) {

		int number = 10;

		while (number % 2 == 0) {

			System.out.print(2 + ",");
			number = number / 2;
		}
		for (int i = 3; i <= Math.sqrt(number); i++) {

			while (number % i == 0) {

				System.out.print(number + ",");

				number = number / i;

			}

		}

		if (number > 2) {

			System.out.print(number);
		}

	}

}
