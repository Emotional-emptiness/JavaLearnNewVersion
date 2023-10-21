package org.example.module11;
// @FunctionalInterface связан с лямбдой
@FunctionalInterface
public interface EmailFunction {
    boolean checkEmail(String email);
}
