package programs;

public class Amstrong {

	// amstrong is a the given number in that each number
	// is qube and after add all the number result is same as given
	// number so that result and given both are same then we called as a
	// amstrong number
	public static void main(String[] args) {

		int number = 153;
		int number1 = number;
		int temp = number;

		int result = 0;
		int i = 0;
		int sum = 0;

		while (number != 0) {

			number = number / 10;

			i++;

		}
//		System.out.println(i);

		while (number1 != 0) {

			result = number1 % 10;
			result = (int) Math.pow(result, i);

			sum = sum + result;

			number1 = number1 / 10;

		}

		if (temp == sum) {

			System.out.println("it is a amstrong");

		} else {
			System.out.println("it is not a  amstrong");

		}

	}
}
