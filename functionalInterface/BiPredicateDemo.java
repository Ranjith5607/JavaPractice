package functionalInterface;

import java.util.function.BiPredicate;

@FunctionalInterface
interface If1 {
    public void v1();


    public static void v2() {

    }

    default void v3() {

    }

    public static final int NUMBER = 10;

}

public class BiPredicateDemo {
    public static void main(String[] args) {
//        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
//            @Override
//            public boolean test(String o1, String o2) {
//                return o1.equals(o2);
//            }
//        };

        BiPredicate<String, String> bi = (s1, s2) -> s1.equals(s2);
        System.out.println(bi.test("a", "a"));
    }
}
