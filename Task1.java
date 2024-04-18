package org.example;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        try {
            String string = Files.readString(Path.of("text.txt"));
            String result = string.replaceAll("[^a-zА-я0-9]", " ");
            String[] split = result.replaceAll("\\s{2,}", " ").split(" ");
            HashMap<String, Integer> map = new HashMap<>();
            for (String s : split) {
                map.merge(s, 1, Integer::sum);
            }
            System.out.println(map);
            File resultFile = new File("result.txt");
            if (!resultFile.exists()) {
                resultFile.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            map.forEach((key, value) -> sb.append(key).append(": ").append(value).append("\n"));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile, false))) {
                bw.write(sb.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
//        }
        }
    }
}

