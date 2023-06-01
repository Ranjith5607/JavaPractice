package programs;

public class ReverceProgram {

	public static void main(String[] args) {

		String str1 = "Ranjith";
		StringBuilder builder1 = new StringBuilder(str1);
		System.out.println("string builder reverce: " + builder1.reverse());

		String str2 = "Ranjith";

		char[] chars = str2.toCharArray();
		System.out.print("tocharArray reverce print: ");
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}

		int i = 123;
		StringBuilder builder2 = new StringBuilder();
		builder2.append(i);
		System.out.println();
		System.out.println("string builder reverce:" + builder2.reverse());

		// using loop
		int number = 123;
		int reminder = 0;
		int reverce = 0;
		while (number > 0) {

			reminder = number % 10;
			reverce = reverce * 10 + reminder;
			number = number / 10;

		}
		System.out.println("using loop reverce: " + reverce);

	}

}
