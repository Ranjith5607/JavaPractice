package java8programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheDuplicateWords {

    public static void main(String[] args) {
		Integer[] numbers= new Integer[]{1,2,3,4,1,2,3,4,7};

		//Step1  convert to the List because of stream clc
		List<Integer> arrayList=Arrays.asList(numbers);

		//step2 Count the duplicate  numbers
		HashMap<Integer, Long> collect = arrayList.stream()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		//print  the duplicate values
		collect.keySet().stream().filter(f -> (collect.get(f.intValue()) > 1))
                .forEach(c -> System.out.println("key:" + c.intValue() + " value:" + collect.get(c.intValue())));
        System.out.println(collect);





		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 7);
        //To find the distinct numbers
        asList.stream().map(f -> f.intValue()).collect(Collectors.toSet()).forEach(System.out::println);
    }

}
