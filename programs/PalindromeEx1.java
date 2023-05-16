package programs;

public class PalindromeEx1 {
	public static void main(String[] args) {

		int number = 132;
		int temp = number;

		int reverse = 0;

		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}

		System.out.println(reverse);

		if (temp == reverse) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");

		}

	}

}
