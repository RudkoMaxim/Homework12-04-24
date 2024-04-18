package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task3Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
