package java8programs;

import java.util.StringJoiner;

public class JoinerEx1 {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",", "#", "#");
		joiner.add("Ranjith");
		joiner.add("ramu");
		System.out.println(joiner);
	}

}
