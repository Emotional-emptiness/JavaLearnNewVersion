package org.example.module10;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 10;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(max) + 1;
            int attempts = 0;
            System.out.println("Угадайте число от 1 до 10, используя 5 попыток!");
            boolean restart = true;

            while (restart) {
                System.out.println("Введите число: ");
                if (scanner.hasNextInt()) {
                    int guess = scanner.nextInt();
                    if (guess == randomNumber) {
                        System.out.println("Вы выиграли");
                        System.out.println("Отличная игра!");
                        restart = false;
                    } else {
                        System.out.println("Вы не угадали, попробуйте еще раз: ");
                        attempts++;
                        System.out.println("Номер попытки: " + attempts);
                    }
                } else {
                    System.out.println("Пожалуйста, введите только числа.");
                    scanner.next();
                }
                if (attempts == 6) {
                    System.out.println("Попытки закончились, Вы проиграли");
                    restart = false;
                }
            }

            System.out.println("Хотите сыграть еще раз? (1 - Да, 0 - Нет): ");
            boolean validChoice = false;
            int choice = -1;
            do {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice == 0 || choice == 1) {
                        validChoice = true;
                    } else {
                        System.out.println("Пожалуйста, введите только 1 или 0.");
                    }
                } else {
                    System.out.println("Пожалуйста, введите только 1 или 0.");
                    scanner.next();
                }
            } while (!validChoice);

            if (choice == 0) {
                playAgain = false;
            }
        }
        scanner.close();
    }
}
