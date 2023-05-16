package methodRefrence;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Addition {
    public static int addition(int a, int b) {

        return a + b;
    }

}

public class MethodReferenceStatic {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = Addition::addition;
        System.out.println(biFunction.apply(10, 20));

        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(4));
    }
}
