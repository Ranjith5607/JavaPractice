package methodRefrence;


import java.util.function.BiFunction;

class Add {

    public int addition(int a, int b) {

        return a + b;
    }
}

public class ReferenceToInstanceMethod {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = new Add()::addition;

        System.out.println(sum.apply(10, 20));


    }
}
