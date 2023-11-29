package org.example.module11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalInterfaceDemo {
    private static List<String> emails = Arrays.asList("oleksander.yanov@google.com"
            , "oleksander@gmail.com", "igor.petlura@mail.ru", "ivan.trytiak@gmail.com"
            , "anton@gmail.com", "serhii@google.com");

    public static void main(String[] args) {

        final Map<String, Integer> result = calculateEmailLetters(emails, email -> email.length());
        System.out.println("result = " + result);

    }
    private static Map<String,Integer> calculateEmailLetters(List<String> emails, Function<String,Integer> function) {
        Map<String, Integer> result = new HashMap<>();

        for (String email : emails) {
            result.put(email, function.apply(email));
        }
        return result;
    }
}
