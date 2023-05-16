package java8programs;

import java.util.Arrays;
import java.util.List;

public class WhoseLenghtGreterThen3 {
	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Ranjith", "Ram", "Pranitha", "pradeep");

		long count = listOfString.stream().filter(f -> f.length() > 3).count();
		System.out.println("the given listOfString greaterThen 3:" + count);

	}

}
