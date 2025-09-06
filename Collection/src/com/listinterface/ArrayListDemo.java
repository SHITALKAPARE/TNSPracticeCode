package com.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Using generics to avoid raw type warnings
        List<Object> list = new ArrayList<>(); // dynamic binding

        System.out.println(list.isEmpty());
        list.add(10);
        list.add(20);
        list.add("Siddhant");
        list.add(false);
        list.add(10);
        list.add(null);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Is list contains 10? " + list.contains(10));

        list.remove(1);
        System.out.println(list);

        list.remove("Siddhant");
        System.out.println(list);

        System.out.println("Element at index 0: " + list.get(0));

        System.out.println("Index of 10: " + list.indexOf(10));

        System.out.println("Removed element: " + list.remove(0));

        list.clear();
        System.out.println("After clear: " + list);

        // Generics with Strings
        List<String> names = new ArrayList<>();

        names.add("Pallavi");
        names.add("Om");
        names.add("Priya");
        names.add("Pooja");
        names.add("Shubham");

        System.out.println("Original names: " + names);

        // Reverse list
        Collections.reverse(names);
        System.out.println("Reversed names: " + names);

        // Sort list
        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        // Traversing a List and removing "Pooja"
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            String nm = i.next();

            if (nm.equals("Pooja")) {
                i.remove();
                System.out.println("Removed: " + nm);
            }
        }

        System.out.println("Final names: " + names);
    }
}
