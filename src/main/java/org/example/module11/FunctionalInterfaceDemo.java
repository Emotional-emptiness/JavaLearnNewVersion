package org.example.module11;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    private static List<String> emails = Arrays.asList("oleksander.yanov@google.com"
            , "oleksander@gmail.com", "igor.petlura@mail.ru", "ivan.trytiak@gmail.com"
            , "anton@gmail.com", "serhii@google.com");

    public static void main(String[] args) {
        // func example
        final Map<String, Integer> result = calculateEmailLetters(emails, email -> email.length());
        System.out.println("result = " + result);

        // consumer example
        Consumer<Map<String, Integer>> consumer = map -> {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Email : " + entry.getKey() + " hava " + entry.getValue() + " letters");
            }
        };
        consumer.accept(result);

        // supplier example
        Supplier<Integer> randomDigit = () -> new Random().nextInt(100) * 50;
        System.out.println(randomDigit.get());
    }
    private static Map<String,Integer> calculateEmailLetters(List<String> emails, Function<String,Integer> function) {
        Map<String, Integer> result = new HashMap<>();

        for (String email : emails) {
            result.put(email, function.apply(email));
        }
        return result;
    }
}
