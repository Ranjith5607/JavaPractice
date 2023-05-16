package programs;

public class FibbanicSeries {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int result = 0;
		

		for (int i = 0; i <= 10; i++) {

			if (i <= 1) {

				result = i;

			} else

			{
				result = first + second;
				first = second;
				second = result;

			}
			System.out.println(result);

		}

	}

}
