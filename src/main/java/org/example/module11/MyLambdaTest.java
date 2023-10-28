package org.example.module11;
public class MyLambdaTest {
    public static void main(String[] args) {
        MyMultiplication myMultiplication = new MyMultiplication();
        int mult = myMultiplication.multiplication(5,5, (a, b) -> a*b );
        int mult2 = myMultiplication.multiplication(4,6, (a, b) -> a*b*a);
        System.out.println("mult = " + mult);
        System.out.println("mult = " + mult2);
    }
}
