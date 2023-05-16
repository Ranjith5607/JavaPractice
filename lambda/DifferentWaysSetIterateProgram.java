package lambda;

import java.util.HashSet;
import java.util.Set;

public class DifferentWaysSetIterateProgram {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<String>();
        courses.add("a");
        courses.add("b");
        courses.add("c");
        courses.add("d");

        courses.forEach(DifferentWaysSetIterateProgram::course);
        courses.forEach(c->course(c));
        courses.stream().forEach(c->course(c));
        courses.stream().forEach(c->course(c));

    }

    private static void course(String course) {
        System.out.println(course);
    }
}
