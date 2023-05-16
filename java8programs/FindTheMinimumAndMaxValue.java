package java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindTheMinimumAndMaxValue {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8, 9, 1);
		Collections.sort(list);
		System.out.println(list.get(0));

		int min = list.stream().min(Comparator.comparingInt(Integer::intValue)).get().intValue();
		System.out.println(min);

		// HighestValue

		Collections.reverse(list);
		System.out.println(list.get(0));

		int maxValue = list.stream().max(Comparator.comparingInt(Integer::intValue)).get().intValue();
		System.out.println(maxValue);

		// secondHighstValue
		int intValue = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get().intValue();
		System.out.println(intValue);

	}

}
