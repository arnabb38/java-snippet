package com.arnabb.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoCSVHandling {
    public static void main(String[] args) throws IOException {
        Stream<String> row = Files.lines(Paths.get("assets/demoCSV.txt"));

        Map<String, Integer> map = new HashMap<>();

        map = row.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1].trim()) < 15)
                .collect(Collectors.toMap(
                        x -> x[0], x -> Integer.parseInt(x[1].trim())));

        row.close();

        for (String key : map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }
    }
}
