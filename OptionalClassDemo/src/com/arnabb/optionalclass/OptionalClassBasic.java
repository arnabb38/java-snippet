package com.arnabb.optionalclass;

import java.util.Optional;

public class OptionalClassBasic {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isPresent());

        String orElse = hello
                .map(String::toLowerCase)
                .orElseGet(() -> {
                    return "orElseGet, coz the value is NULL";
                });

//        String orElseThrow = hello
//                .map(String::toLowerCase)
//                .orElseThrow(IllegalStateException::new);

        hello.ifPresent(System.out::println);

//        String orElseThrow = hello
//                .map(String::toLowerCase)
//                .orElseThrow(IllegalStateException::new);

//        System.out.println(orElseThrow);


    }
}
