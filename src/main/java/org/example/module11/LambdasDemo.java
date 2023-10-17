package org.example.module11;

import java.util.*;

// решить задачу потом : дается строка символов, и  надо вывести в консоль раз повторяется символ n ( можно усложнить и написать код который возвращяет самый частый символ который встречается в строке )
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

        EmailFunction emailFunction = email -> email.contains("gmail.com") && email.length() > 20;
        checkEmail(emails, emailFunction);

        final String googleRegxp = "google.com";
        checkEmail(emails, email -> email.contains(googleRegxp));
        checkEmail(emails, email -> email.length() > 10);

        Collections.sort(emails, (o1, o2) -> (o1.length() - o2.length()));
        System.out.println(emails);
    }
    private static List<String> checkEmail(List<String> emails , EmailFunction function) {
        List<String> result = new ArrayList<>();
        for (String email : emails) {
            if (email.contains("gmail.com")) {
                result.add(email);
            }
        }
        return result;
    }
}
