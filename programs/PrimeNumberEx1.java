package programs;

public class PrimeNumberEx1 {

	static int count = 0;

	void prime(int number) {

		for (int i = 2; i <= number; i++) {

			if (number % i == 0) {
				count++;

			}

		}

		if (count > 1) {

		} else {
			if (number == 1) {

			} else {
				System.out.println(number);

			}
		}

		count = 0;

	}

	public static void main(String[] args) {

		PrimeNumberEx1 primeNumberEx1 = new PrimeNumberEx1();

		for (int j = 1; j <= 100; j++) {
			primeNumberEx1.prime(j);

		}

	}

}
