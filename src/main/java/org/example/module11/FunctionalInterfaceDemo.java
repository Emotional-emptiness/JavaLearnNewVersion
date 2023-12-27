package org.example.module11;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceDemo {
    final private static List<String> emails = Arrays.asList("oleksander.yanov@google.com"
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
        Integer randomNumber = randomDigit.get();
        System.out.println("supplier example 1 : " + randomNumber);
        System.out.println("supplier example 2 : " + randomDigit.get());

        // binaryOperator example
        BinaryOperator<Integer> multiply = (x, y) -> x*y;
        Integer apply = multiply.apply(34, 34);
        System.out.println("binaryOperator example 1 : " + apply);
        System.out.println("binaryOperator example 2 : " + multiply.apply(3,3));

        // unaryOperator example
        UnaryOperator<Integer> sum = x -> x + x;
        Integer sumX = sum.apply(12);
        System.out.println("unaryOperator example 1 : "+ sumX);
        System.out.println("unaryOperator example 2 :" + sum.apply(2));
    }
    private static Map<String,Integer> calculateEmailLetters(List<String> emails, Function<String,Integer> function) {
        Map<String, Integer> result = new HashMap<>();

        for (String email : emails) {
            result.put(email, function.apply(email));
        }
        return result;
    }
}
