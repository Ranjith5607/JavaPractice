package java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {

		List<Integer> listofIntegers1 = Arrays.asList(1, 3, 2, 7, 65, 8, 9);
		List<Integer> listofIntegers2 = Arrays.asList(1, 3, 2, 7, 65, 8, 9);

		listofIntegers1.stream().sorted().forEach(c -> System.out.print(c + " "));

		Collections.sort(listofIntegers2);
		System.out.println(" ");

		// Max out put
		System.out.print(listofIntegers2);
		System.out.println(" ");
		System.out.println(Collections.max(listofIntegers2));

		// Min out put
		System.out.print(listofIntegers2);
		System.out.println(" ");
		System.out.println(Collections.min(listofIntegers2));

		// Second highest out put
		System.out.print(listofIntegers2);
		System.out.println(" ");
		Collections.sort(listofIntegers2);
		System.out.println(listofIntegers2.get(listofIntegers2.size()-2));

	}

}
