package com.example.demo.registration;

import org.springframework.context.annotation.Configuration;

import java.util.function.Predicate;

@Configuration
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO REGEX
        return false;
    }
}
