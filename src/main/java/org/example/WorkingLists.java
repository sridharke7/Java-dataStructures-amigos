package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkingLists {
    public static void main(String[] args) {
        //Lists can have objects of any datatype
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add(1);
        colors.add(new Object());

        //ArrayList with a predefined datatype
        List<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        //color.add(1);

        System.out.println(colors);
        System.out.println(color);
        System.out.println(colors.contains("pink"));
        System.out.println(color.contains("red"));
        System.out.println(colors.size());

        colors.forEach(System.out::println);

        for (int i=0; i<color.size(); i++){
            System.out.println(color.get(i));
        }
    }
}
