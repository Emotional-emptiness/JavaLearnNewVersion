package org.example.module11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReference {
    private static List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(2,"Bohdan", UserStatus.ACTIVE));
        employees.add(new Employee(3, "Andrew", UserStatus.ACTIVE));
        employees.add(new Employee(4, "Taras", UserStatus.NOT_ACTIVE));
        employees.add(new Employee(5, "Andrew",UserStatus.NOT_ACTIVE));
    }
    public static void main(String[] args) {
        // static method
        Consumer<Employee> printEmployee = employee -> EmployeeUtils.printEmployee(employee);
        Consumer<Employee> printEmployeeWithReference = EmployeeUtils::printEmployee;
        printEmployeeWithReference.accept(new Employee(1, "Serg", UserStatus.ACTIVE));

        // non-static method with class instance
        EmployeeUtils employeeUtils = new EmployeeUtils();
        Consumer<String> printName = name -> employeeUtils.printName(name);
        Consumer<String> printNameWithReference = employeeUtils::printName;
        printNameWithReference.accept("Olegdf");

        // non-static method without class instance
        BiConsumer<EmployeeUtils, String> printName1 = (employeeUtil, name) -> employeeUtil.printName(name);
        BiConsumer<EmployeeUtils, String> printNameWithReference1 = EmployeeUtils::printName;
        printNameWithReference1.accept(new EmployeeUtils(), "Taras");

        // constructor, create  instance
        Supplier<Employee> getEmployee = () -> new Employee();
        Supplier<Employee> getEmployeeWithReference  = Employee::new;
        getEmployeeWithReference.get();
    }
}
