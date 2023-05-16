package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestEx3 {

	public static void main(String[] args) {

		String s1 = "I am from india and i am from bangalur";

		// step2: to convert the lowercase
		// and split it and comvert list type
		// using stream we need to add the how times is repeting

		String lowerCase = s1.toLowerCase();
		String[] split = lowerCase.split(" ");

		List<String> asList = Arrays.asList(split);

		HashMap<String, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		Iterator<String> iterator = collect.keySet().iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			if (collect.get(string) > 1) {
				System.out.println("key name:" + string + " value:" + collect.get(string));

			}

		}

//		System.out.println(collect);
	}

//	select name,id,salary  from  emp  groupby salary orderby desc salary limit 1,2;

}
