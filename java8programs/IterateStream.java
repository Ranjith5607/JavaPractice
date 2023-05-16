package java8programs;

import java.util.Arrays;
import java.util.List;

public class IterateStream {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Ranjith", "Hello");

		asList.stream().forEach(System.out::println);

	}
}
