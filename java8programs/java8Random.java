package java8programs;

import java.util.Random;

public class java8Random {

	public static void main(String[] args) {

		Random random = new Random();
		random.ints(4).forEach(System.out::println);

	}

}
