package com.arnabb.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoStringManipulation {
    public static void main(String[] args) {
        // 8. file io and stream
        Stream<String> bands = null;
        try {
            bands = Files.lines(Paths.get("assets/bands.txt"));

            bands.sorted().filter(x -> x.length() > 10).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing File!");
            bands.close();
        }


        // 9. file io and stream, collect
        Stream<String> bands2 = null;
        try {
            bands2 = Files.lines(Paths.get("assets/bands.txt"));

            bands2.filter(x -> x.contains("th")).collect(Collectors.toList()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("\nClosing File!");
            bands2.close();
        }

    }
}
