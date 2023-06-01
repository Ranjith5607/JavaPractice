package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String args[]) {
		Stream.of("1", "2", "3").peek(e -> System.out.println(e)).collect(Collectors.toList());

		int[] ints = { 11, 22, 33, 44, 55 };
		IntStream stream = Arrays.stream(ints);
		int reduceSumEx2 = stream.reduce(0, Integer::sum);

//		System.out.println(reduceSumEx1);
		System.out.println(reduceSumEx2);

	}

}
