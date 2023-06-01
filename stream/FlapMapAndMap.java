package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlapMapAndMap {

	public static void main(String[] args) {

		List<List<Integer>> integers = new ArrayList<>();
		integers.add(Arrays.asList(1, 2));
		integers.add(Arrays.asList(3, 4));
		integers.add(Arrays.asList(5, 6));
		integers.add(Arrays.asList(7, 8));

		// using the flatmap
		List<Integer> flatMap = integers.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		// collect.forEach(System.out::println);
		System.out.println(flatMap);

		// using map
		List<Stream<Integer>> map = integers.stream().map(list -> list.stream()).collect(Collectors.toList());

		System.out.println(map);

		Stream<Integer> distinct = Stream.of(1, 3, 2, 1, 1).distinct();
		distinct.forEach(System.out::println);

	}
}
