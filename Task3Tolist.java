package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3Tolist {
    public static void main(String[] args)
    {
        Stream<String> s = Stream.of("One", "Two", "Three","Four","Five");
        List<String> myList = s.collect(Collectors.toList());
        System.out.println(myList);
    }
}
