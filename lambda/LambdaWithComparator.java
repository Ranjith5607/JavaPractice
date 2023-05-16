package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class LambdaWithComparator {

    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("abc", 30));
        personArrayList.add(new Person("abc", 29));
        personArrayList.add(new Person("abc", 28));
        personArrayList.add(new Person("abc", 27));


//        Comparator<Person> person = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//
//        Collections.sort(personArrayList, person);
//        for (Person persons :
//                personArrayList) {
//
//            System.out.println(persons.getName() + "->" + persons.getAge());
//        }

        //using Lambda
        Collections.sort(personArrayList, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        personArrayList.forEach((p)->System.out.println(p.getName() + "->"+p.getAge()));
    }
}
