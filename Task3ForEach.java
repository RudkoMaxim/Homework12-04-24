package org.example;

import java.util.Arrays;

public class Task3ForEach {
    public static void main(String[] args) {
        int [] array = {1,4,8,9,6,7};
        Arrays.stream(array).forEach(element-> {element*=3;
            System.out.println(element);});
    }
}
