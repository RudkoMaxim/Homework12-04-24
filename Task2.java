package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Task2 {
    public static void main(String args[])
    {
        List<String> students = Arrays.asList("Adam", "John", "Paul", "Tim", "Jack");
        Predicate<String> p = (s) -> s.startsWith("J");
        for (String s : students) {
            if (p.test(s))
                System.out.println(s);
        }
    }
}
