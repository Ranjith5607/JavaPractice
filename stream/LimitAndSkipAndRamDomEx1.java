package stream;

import java.util.Random;
import java.util.stream.Stream;

public class LimitAndSkipAndRamDomEx1 {

    public static void main(String[] args) {
        Stream<Integer>  integerStream=Stream.of(0,1,2,3,4,5,6,7,8,9).skip(6);

        integerStream.forEach((r)->System.out.println(r));

       Stream<Integer> limitStream=Stream.of(0,1,2,3,4,5,6,7,8,9).limit(6);
        limitStream.forEach((r)->System.out.println(r));

        Random  ramdom =  new Random();
        System.out.println("===========================");
        ramdom.ints().limit(4).forEach((r->System.out.println(r)));

    }
}
