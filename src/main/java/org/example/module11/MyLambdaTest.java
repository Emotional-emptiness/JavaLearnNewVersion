package org.example.module11;
public class MyLambdaTest {
    public static void main(String[] args) {
        MyMultiplication myMultiplication = new MyMultiplication();
        int mult = myMultiplication.multiplication(5,5, (a, b) -> a*b );
        int mult1 = myMultiplication.multiplication(4,6, (a, b) -> a*b*a);
        int mult2 = myMultiplication.multiplication(2, 3, (a, b) -> {
            return (a + b)*(a + b);
        });
        System.out.println("mult = " + mult);
        System.out.println("mult1 = " + mult1);
        System.out.println("mult2 = " + mult2);
    }
}
