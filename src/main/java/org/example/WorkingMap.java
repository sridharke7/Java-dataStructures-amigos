package org.example;

import java.util.HashMap;
import java.util.Map;

public class WorkingMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Sharmila"));
        map.put(2, new Person("Rose"));
        map.put(3, new Person("Shilpa"));

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(new Person("Sharmila")));
        map.entrySet().forEach(System.out::println);
    }

    record Person (String name){}
}
