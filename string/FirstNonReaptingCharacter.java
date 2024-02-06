package string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonReaptingCharacter {

	public static void main(String[] args) {

		Scanner  enterText = new Scanner(System.in);
		System.out.println("Please provide  input Text:");
		String   stringText=enterText.nextLine();

		if(stringText.isBlank()||stringText.isEmpty()){

			System.out.println("Please provide valid input:");

		}


		// step1: convert the string to chars
		char[] chars = stringText.toCharArray();

		//step2: all chars to add to list
		List<Character> list = new ArrayList<Character>();
		for (int i=0; i <chars.length-1; i++) {
			list.add(chars[i]);

		}

		System.out.println("chars in list:"+list);


		//step3: Using collections.frequency() and collectors.counting() to find NONRC
		LinkedHashMap<Character, Long> collect = list.stream().filter(f -> Collections.frequency(list, f) == 1)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect.keySet().stream().limit(1).collect(Collectors.toList()));
	}

}
