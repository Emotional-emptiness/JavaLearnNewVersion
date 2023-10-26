package org.example.module11;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.calc(2, 3, new Calculable() {
            public int calc(int a, int b) {
                return a + b;
            }
        });
        System.out.println(sum);

        int sub = calculator.calc(5, 4, new Calculable() {
            public int calc(int a, int b) {
                return a - b;
            }
        });
        System.out.println(sub);
    }
}
