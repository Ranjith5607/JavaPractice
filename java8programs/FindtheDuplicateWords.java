package java8programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheDuplicateWords {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 7);
		asList.stream().map(f -> f.intValue()).collect(Collectors.toSet()).forEach(System.out::println);

		// count the number id it is repeated;
		HashMap<Integer, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		collect.keySet().stream().filter(f -> (collect.get(f.intValue()) > 1))
				.forEach(c -> System.out.println("key:" + c.intValue() + " value:" + collect.get(c.intValue())));
		System.out.println(collect);
	}

}
