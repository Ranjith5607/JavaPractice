package numberSystem;

public class DecimalToBinary {

	public static void main(String[] args) {

		int num = 28;

		// to story the binary elements right , we need one array
		// first we need to check divisible by 2 or not
		// if it is divisible 2 then it is zero or else 1
		// after that it will store the value in array
		// if you move to next loop we need to divide by num to by 2

		int[] binary = new int[32];

		int i = 0;

		while (num > 0) {
			binary[i] = num % 2;
			i++;
			num = num / 2;

		}

		System.out.println("---" + i);

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);

		}

	}
}
