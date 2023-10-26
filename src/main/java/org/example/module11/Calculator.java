package org.example.module11;

public class Calculator {
    public int calc(int a, int b, Calculable calculable) {
        return calculable.calc(a,b);
    }
}
