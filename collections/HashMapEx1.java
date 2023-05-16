package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        //Key value is same value is different
        //So here  it is taking the latest  value of  the key that is 2

        stringIntegerHashMap.put("A", 1);
        stringIntegerHashMap.put("B", 2);
        stringIntegerHashMap.put("C", 3);
        stringIntegerHashMap.put("D", 3);
        stringIntegerHashMap.put("E", 3);
        stringIntegerHashMap.put("F", 3);
        stringIntegerHashMap.put("G", 3);
        stringIntegerHashMap.put("H", 3);
        stringIntegerHashMap.put("I", 3);
        stringIntegerHashMap.put("J", 3);
        stringIntegerHashMap.put("K", 3);
        stringIntegerHashMap.put("L", 3);
        stringIntegerHashMap.put(null, null);
        stringIntegerHashMap.put(null, null);






        stringIntegerHashMap.remove(null);
        System.out.println("======>"+stringIntegerHashMap.size());


        Set<String> keySet = stringIntegerHashMap.keySet();
        Iterator<String> iterator = keySet.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }


        System.out.println(stringIntegerHashMap);


    }
}
