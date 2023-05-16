package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestEx2 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder builder = new StringBuilder();

		String str1 = "abcdABCDabcd";
		String str12 = "abc123";

		String str = new String();
		int sum = 0;
		int number = 0;
		for (int i = 0; i < str12.length(); i++) {
			if (Character.isDigit(str12.charAt(i))) {
				str = str + str12.charAt(i);
				number = Integer.parseInt(str);
				sum = sum + number;
				number = 0;
				str = "";

			}
		}

		System.out.println(sum);

		StringBuilder reverse = builder.append(str12).reverse();
//
//		System.out.println(reverse);
//
//		System.out.println(str12.substring(0, 0) + str12.substring(1 + 1));

		char[] charArray = str1.toCharArray();

		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < charArray.length - 1; i++) {

			charList.add(charArray[i]);
		}

		HashMap<Character, Long> collect = charList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		System.out.println(collect);
	}
}
