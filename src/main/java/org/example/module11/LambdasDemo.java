package org.example.module11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {
    private static List<String> emails = Arrays.asList("oleksander.yanov@google.com"
            , "oleksander@gmail.com", "igor.petlura@mail.ru", "ivan.trytiak@gmail.com"
            , "anton@gmail.com", "serhii@google.com");
    public static void main(String[] args) {
        // WITH USING LAMBDA
//        EmailFunction gmailLambda = email -> email.contains("gmail.com");
//        checkEmail(emails, gmailLambda);
//        EmailFunction googleLambda = email -> email.contains("google.com");
//        checkEmail(emails, googleLambda);
//        EmailFunction mailleLambda = email -> email.contains("mail.ru");
//        checkEmail(emails, mailleLambda);

        final Predicate<String> emailFunction = email -> email.contains("gmail.com") && email.length() > 20;
        checkEmail(emails, emailFunction);

        EmailFunction.method();

        final String googleRegxp = "google.com";
        checkEmail(emails, email -> email.contains(googleRegxp));
        checkEmail(emails, email -> email.length() > 10);

        Collections.sort(emails, (o1, o2) -> (o1.length() - o2.length()));
        System.out.println(emails);

        Function<Integer, Double> function = value -> {
            System.out.println("Inside func");
            return value * 0.2;
        };
        System.out.println("Before call apply");
        Double apply = function.apply(453);
        System.out.println(apply);
    }
    private static List<String> checkEmail(List<String> emails , Predicate<String> function) {
        List<String> result = new ArrayList<>();
        for (String email : emails) {
            if (function.test(email)) {
                result.add(email);
            }
        }
        return result;
    }
}
