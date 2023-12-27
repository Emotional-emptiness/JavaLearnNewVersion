package org.example.module11;

public class EmployeeUtils {
    public static void printEmployee(Employee employee) {
        System.out.println("printEmployee : " + "identifier - " + employee.getId());
        System.out.println("printEmployee : "+ "name - " + employee.getName());
    }
    public void printName(String name) {
        System.out.println("printName : " + "name - " + name);
    }
}
