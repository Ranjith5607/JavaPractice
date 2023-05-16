package programs;

public class ReverceProgram {

	public static void main(String[] args) {

		String str = "Ranjith";

		int reverce = 0;

		StringBuilder builder1 = new StringBuilder(str);
 
		char[] chars = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {

			System.out.print(chars[i]);
		}

		int i = 789359;
		StringBuilder builder2 = new StringBuilder();
		builder2.append(i);
		System.out.println();
		System.out.println("builder2:" + builder2.reverse());

		int i4 = (int) 0.02;
		System.out.println("=====" + i4);

		int i3 = 26;

		//

		while (i3 != 0) {

			reverce = reverce * 10 + i3 % 10;

			i3 = i3 / 10;

		}
		System.out.println(reverce);

	}

}
