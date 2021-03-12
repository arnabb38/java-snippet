package com.arnabb.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("A", 1));
        list.add(new Student("B", 2));
        list.add(new Student("C", 3));
        list.add(new Student("D", 4));
        list.add(new Student("E", 5));
        list.add(new Student("F", 6));

        Stream<Student> parallelStream = list.parallelStream();
        parallelStream.forEach(st->doProcess(st));

    }

    private static void doProcess(Student st)
    {
        System.out.println(st);
    }

}
