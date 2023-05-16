package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BiFunctionEx1 {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer>  sum =(t1, t2)->t1+t2;
        System.out.println(sum.apply(10,20));

        Consumer<Integer>  consumer = (t)-> System.out.println(t);

        consumer.accept(10);


    }
}
