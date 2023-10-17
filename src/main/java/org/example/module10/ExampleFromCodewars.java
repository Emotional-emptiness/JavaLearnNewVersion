package org.example.module10;

public class ExampleFromCodewars {
    public static void main(String[] args) {
        System.out.println(binaryAddition(7,0));
    }

    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }
}
