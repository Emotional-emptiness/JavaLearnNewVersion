package org.example.module11;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    private static List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(2,"Bohdan", UserStatus.ACTIVE));
        employees.add(new Employee(3, "Andrew", UserStatus.ACTIVE));
        employees.add(new Employee(4, "Taras", UserStatus.NOT_ACTIVE));
        employees.add(new Employee(5, "Andrew",UserStatus.NOT_ACTIVE));
    }
}
