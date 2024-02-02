package java8programs;

import java.util.Random;
import java.util.stream.IntStream;

public class java8Random {

	public static void main(String[] args) {

		Random random = new Random();

		IntStream ints = random.ints(1,1000,9999);
		ints.forEach(System.out::println);

	}

}
