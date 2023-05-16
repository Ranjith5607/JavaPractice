package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String args[]) {
        Stream.of("1","2","3").peek(e->System.out.println(e)).collect(Collectors.toList());

        int[] ints = {11, 22, 33, 44, 55};
        IntStream stream = Arrays.stream(ints);
      //  int reduce = stream.reduce(0, (left,right) -> left + right);
        int reduce = stream.reduce(0, Integer::sum);

        System.out.println(reduce);


//        Set<Integer> objects = Collections.synchronizedSet(new HashSet<>());
//        Stream.parallel().map(e -> {
//            if (objects.add(e)) {
//
//                return 0;
//            } else {
//
//                return e;
//            }
//        });


    }

}
