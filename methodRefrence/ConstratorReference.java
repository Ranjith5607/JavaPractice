package methodRefrence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstratorReference {

    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");

        Function<List<String>, Set<String>> function = HashSet::new;
        System.out.println(function.apply(fruit));

    }
}
