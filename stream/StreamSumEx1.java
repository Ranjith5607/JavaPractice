package stream;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StreamSumEx1 {

	public static void main(String[] args) {
		List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5);

		int sum = integersList.stream().mapToInt(i -> i.intValue()).sum();

		System.out.println(sum);

		int valueMax = integersList.stream().mapToInt(i -> i.intValue()).max().getAsInt();
		System.out.println(valueMax);

		int sum2 = integersList.stream().mapToInt(i -> i.intValue()).skip(3).sum();
		System.out.println(sum2);
		int limitSum = integersList.stream().mapToInt(i -> i.intValue()).limit(3).sum();
		System.out.println(limitSum);

		StringJoiner stj = new StringJoiner(",", "(Ranjith", ")");
		System.out.println(stj);
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.parallelSort(arr);

		// Sorted the Array using parallelSort()
		System.out.println(Arrays.stream(arr));
		Arrays.stream(arr).forEach((n) -> System.out.print(n + " "));
	}
}
