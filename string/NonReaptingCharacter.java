package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReaptingCharacter {

	public static void main(String[] args) {
		String str = "yahoo";

		char[] chars = str.toCharArray();

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < chars.length; i++) {
			list.add(chars[i]);

		}

		HashMap<Character, Long> collect = list.stream().filter(f -> Collections.frequency(list, f) == 1)
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		System.out.println(collect);
	}

}
