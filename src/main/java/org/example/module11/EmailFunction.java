package org.example.module11;
// @FunctionalInterface связан с лямбдой
@FunctionalInterface
public interface EmailFunction {
    boolean checkEmail(String email);

    static void method() {
        System.out.println("Static method");
    }

    default void methodMethod() {
        System.out.println("Default method");
    }
}
