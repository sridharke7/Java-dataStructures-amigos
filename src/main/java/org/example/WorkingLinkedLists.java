package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> doublyLinkedPerson = new LinkedList<>();
        doublyLinkedPerson.add(new Person("Tessa", 21));
        doublyLinkedPerson.add(new Person("Josephine", 20));
        doublyLinkedPerson.add(new Person("Teresa", 19));

        System.out.println(doublyLinkedPerson.peek());
        System.out.println(doublyLinkedPerson.pop());
        doublyLinkedPerson.addLast(new Person("Margret", 20));
        doublyLinkedPerson.addFirst(new Person("Jenice", 22));
        System.out.println(doublyLinkedPerson.size());
        System.out.println(doublyLinkedPerson.peek());
        System.out.println();
          ListIterator<Person> personListIterator = doublyLinkedPerson.listIterator();
            while (personListIterator.hasNext()) {
                System.out.println(personListIterator.next());
            }
         System.out.println();
            while(personListIterator.hasPrevious()){
                System.out.println(personListIterator.previous());
            }
//        System.out.println();
        }
    static record Person(String name, int age){}
}
