package org.example.module11;

public class CalculatorTestWithLambda {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        int sum = calculator.calc(2,2, Integer::sum); можно сделать и так
        int sum = calculator.calc(2, 15, (a, b) -> a + b);
        int sub = calculator.calc(2,3, (a, b) -> a - b);
        System.out.println(sum);
        System.out.println(sub);
    }
}
