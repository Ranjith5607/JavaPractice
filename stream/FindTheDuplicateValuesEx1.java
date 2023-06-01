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

		// To print the duplicate words
		String str = "ranjith Kumar Ranjith";
		List<String> listString = Arrays.stream(str.toUpperCase().split(" ")).collect(Collectors.toList());
		Set<String> setObj = new HashSet<>();
		Set<String> collectSetObj = listString.stream().filter(f -> !setObj.add(f)).collect(Collectors.toSet());
		// To print the words
		System.out.println("print the duplicate words " + collectSetObj);

		String[] split = str.toUpperCase().split(" ");
		List<String> asList = Arrays.asList(split);
		HashMap<String, Long> collectHashMap = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		Set<String> keySet = collectHashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (collectHashMap.get(string) > 1) {
				System.out.println("Key:" + string + " value:" + collectHashMap.get(string));
			}

		}

		// Another way
		// print the duplicate words and count
		Map<String, Integer> duplicateWord = Arrays.stream(str.toUpperCase().split(" "))
				.collect(Collectors.toMap(Function.identity(), f -> 1, Math::addExact));

		System.out.println("print the duplicate words in numbers" + duplicateWord);
	}
}
