package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingQueue {
    public static void main(String[] args) {

        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("Neil", 23));
        superMarket.add(new Person("Nikki", 22));
        superMarket.add(new Person("Aish", 21));

        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());

    }
    static record Person(String name, int age){}
}
