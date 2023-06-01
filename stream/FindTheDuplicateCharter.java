package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateCharter {

	public static void main(String[] args) {
		String input = "civicAA";
		StringBuilder stringBuilder = new StringBuilder(input);
		String s1 = stringBuilder.reverse().toString();
		System.out.println(s1.equals(input));

		Map<Character, Long> collect = 
				input.chars().mapToObj(s -> Character.valueOf((char)s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() > 1)
				.collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue()));

        System.out.println(collect);

	}
}
