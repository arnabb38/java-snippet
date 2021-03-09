package com.arnabb.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoReduce {
    public static void main(String[] args) {

        // reduction - sum
        double total = Stream.of(2.3, 4.5, 4.5)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);


        // reduction - summary statistic
        IntSummaryStatistics  summary = IntStream.of(1, 3, 4, 5, 5, 3, 3, 0, 9, 10)
                .summaryStatistics();
        System.out.println(summary);


    }
}
