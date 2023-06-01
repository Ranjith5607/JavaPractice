package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheDuplicateValues {
    public static void main(String ranjith[]) {

        List<String> listOfStrings = Arrays.asList("a", "a","a" ,"b", "b");

       Map<String,Integer> map= listOfStrings.stream().collect(Collectors.toMap(Function.identity(),(list)->{
           return 1;
       },(integer, integer2) -> integer+integer2));
//       System.out.println(map);

        Map<String, Long> collect = listOfStrings.stream().filter(f->Collections.frequency(listOfStrings,f)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

        String input="Java is good java is good";
        Character character = input.chars()
                .mapToObj(s->Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1L)
                .map(entry->entry.getKey())
                .findFirst()
                .get();


        System.out.println(character);
        
        
        String trim = input.replaceAll(" ", "");
        
        
        LinkedHashMap<Character, Long> collect2 = trim.chars().mapToObj(t->Character.toLowerCase((char)t))
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        
        System.out.println(collect2);

    }
}
