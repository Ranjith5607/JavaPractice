package string;

import java.util.Scanner;

public class AnagramsOfTwoStrings {

	public static void anagaramOfTwoString(String str1, String str2) {

		StringBuilder builder1 = new StringBuilder(str1);
		builder1.reverse();
		if (str1.equals(builder1.toString())) {

			System.out.println("anagaram is  string1:" + str1);

		}

		else {
			System.out.println("anagaram is not  string1:" + str1);

		}

		StringBuilder builder2 = new StringBuilder(str2);
		builder2.reverse();
		if (str2.equals(builder2.toString())) {

			System.out.println("anagaram is string2:" + str2);

		}

		else {
			System.out.println("anagaram is not  string2:" + str2);

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String next1 = sc.next();
		String next2 = sc.next();
		anagaramOfTwoString(next1, next2);
	}
}
