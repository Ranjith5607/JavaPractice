package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReaptingCharacter {

	public static void main(String[] args) {
		String str = "yahoo";

		// step1: convert the string to chars
		char[] chars = str.toCharArray();

		System.out.println("chars in :"+chars[0]+chars[1]+chars[2]+chars[3]+chars[4]);

		//step2: all chars to add to list
		List<Character> list = new ArrayList<Character>();
		for (int i=chars.length-1; i >= 0; i--) {
			list.add(chars[i]);

		}
		System.out.println("chars in list:"+list);

		//Using collections.frequency() and collectors.counting() to find NONRC
		HashMap<Character, Long> collect = list.stream().filter(f -> Collections.frequency(list, f) == 1)
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		System.out.println(collect);
	}

}
