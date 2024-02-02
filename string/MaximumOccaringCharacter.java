package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumOccaringCharacter {

    public static void main(String[] args) {

        String str = "take ufo rwarddd oo";

        //step1: Remove the  white space
        String replace = str.replace(" ", "");

        //step2:  convert in charArray
        char[] charArray = replace.toCharArray();

        //step3: convert charArray to listArray
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {

            list.add(charArray[i]);

        }

		//step4: Using
        HashMap<Character, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        Entry<Character, Long> entry = collect.entrySet().stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get();

        System.out.println(entry);
    }

}