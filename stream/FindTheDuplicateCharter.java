package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindTheDuplicateCharter{

    public static void main(String[] args) {
        String input="civic";
        StringBuilder stringBuilder = new StringBuilder(input);
        String s1 = stringBuilder.reverse().toString();
        System.out.println(s1.equals(input));


//        input.chars().
//                mapToObj(s -> Character.toLowerCase((char) s)).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(f -> f.getValue() > 1)
//                .collect(Collectors.toMap(characterLongEntry -> characterLongEntry.getKey(), o -> o.getValue()));


//        System.out.println(collect);

    }
}
