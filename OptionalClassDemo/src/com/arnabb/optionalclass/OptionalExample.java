package com.arnabb.optionalclass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Person person = new Person("Arnab", null);

        // using map and orElse
//        System.out.println(person.getEmail()
//                .map(s -> s.toUpperCase())
//                .orElse("email not provided!"));

        // similar using isPresent method
        if (person.getEmail().isPresent()) {
            String email = person.getEmail().get();
            System.out.println("Name: " + person.getName() + "\n" + "Email: " + email.toUpperCase());
        } else {
            System.out.println("Name: " + person.getName() + "\n" + "Email: " + "email not provided!");
        }

    }
}

class Person {
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
