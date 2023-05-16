package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceTest {
    public static void main(String[] args) {

        List<Integer> integer = Arrays.asList(1, 2, 3);
        Integer reduce = integer.stream().reduce(10, (a, b) -> a + b);
        Integer reduce1 = integer.stream().reduce(0, Integer::max);
        System.out.println(reduce);
        System.out.println(reduce1);

        List<Integer> collect = integer.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> s1 = names.stream().filter(s -> s.startsWith("C")).collect(Collectors.toList());

        System.out.println(s1);
        List result = names.stream().sorted().collect(Collectors.toList());

        System.out.println(result);


    }


    }

