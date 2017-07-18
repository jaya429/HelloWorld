package com.example.idea;

import java.util.LinkedList;
import java.util.List;

/**
 * this is my first IntelliJ IDE class
 */
public class Main {

    private String name;

    /**
     *
     * @param args are string values
     */
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello from IntelliJ IDEA!");
        List<String> lst = new LinkedList<>();
        int[] a = {4,6,7,3,5,2};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
        f1();
    }

    private static void f1() {
    f2();
    }

    private static void f2() {
        f3();
    }

    private static void f3() {
        System.out.println("this is the method hierarchy");
    }


}
