package org.example;

import java.util.HashSet;
import java.util.Set;

public class WorkingSets {
    public static void main(String[] args) {

        //duplicates are not allowed in HashSet whereas it is allowed in TreeSet
        Set<balls> colorballs = new HashSet<>();
        colorballs.add(new balls("orange"));
        colorballs.add(new balls("Red"));
        colorballs.add(new balls("blue"));
        colorballs.add(new balls("Red"));
        System.out.println(colorballs.size());

        colorballs.forEach(System.out::println);

    }

    static record balls(String color){}
}
