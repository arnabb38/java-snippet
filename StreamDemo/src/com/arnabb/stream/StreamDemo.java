package com.arnabb.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // 1. int stream
//        IntStream.range(1,10).forEach(System.out::print);

        // 2. int stream skip
//        IntStream.range(1,10).skip(5).forEach(x -> System.out.println(x));

        // 3. int stream sum
//        System.out.println(IntStream.range(1,10).sum());

        // 4. stream.of, sort, find
//        Stream.of("Rasel", "Arnab", "Taslim").sorted().findFirst().ifPresent(System.out::println);

        // 5. stream from array, sort, filter, startWith, forEach
        String [] name = {"Rasel", "Arnab", "Taslim"};
        Arrays.stream(name).filter(x -> x.startsWith("R")).sorted().forEach(System.out::println);

    }
}
