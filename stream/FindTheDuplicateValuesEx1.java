package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateValuesEx1 {
	public static void main(String[] args) {
		String str = "Ranjith Kumar Ranjith";
		List<String> listString = Arrays.stream(str.toUpperCase().split(" ")).collect(Collectors.toList());

		System.out.println(listString);

		// To find the duplicate words
		Set<String> setObj = new HashSet<>();

		Set<String> collectSetObj = listString.stream().filter(f -> !setObj.add(f)).collect(Collectors.toSet());
		// print the duplicate words
		System.out.println(collectSetObj);

		// print the duplicate words and count

		Map<String, Integer> collect = listString.stream()
				.collect(Collectors.toMap(Function.identity(), f -> 1, Math::addExact));

		String[] split = str.split(" ");

		List<String> asList = Arrays.asList(split);
		HashMap<String, Long> collect2 = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		Set<String> keySet = collect2.keySet();

		Iterator<String> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			if (collect2.get(string) > 1) {
				System.out.println("Key:" + string + " value:" + collect2.get(string));

			}

		}

		System.out.println(collect2);

	}
}
