package org.example.module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {
    private static final List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(5,"Bohdan", UserStatus.ACTIVE),
        new Employee(4, "Andrew", UserStatus.ACTIVE),
        new Employee(3, "Taras", UserStatus.NOT_ACTIVE),
        new Employee(2, "",UserStatus.NOT_ACTIVE),
        new Employee(13, "Andrew",UserStatus.NOT_ACTIVE),
        new Employee(1, "Serg",UserStatus.ACTIVE),
        new Employee(8, "James",UserStatus.NOT_ACTIVE),
        new Employee(9, "Jon",UserStatus.ACTIVE),
        new Employee(16, "Misha",UserStatus.ACTIVE),
        new Employee(22, "Lexa",UserStatus.ACTIVE),
        new Employee(212, "Drake",UserStatus.NOT_ACTIVE)
            ));

    public static void main(String[] args) {
        // filter by active status
        List<Employee> activeEmployee = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getStatus() == UserStatus.ACTIVE) {
                activeEmployee.add(employee);
            }
        }
        // sort
        activeEmployee.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });

        // map names
        List<String> employeeNames = new ArrayList<>();
        for(Employee employee : activeEmployee) {
            employeeNames.add(employee.getName());
        }

        // stream
        List<String> employeeWithStream = employees.stream()
                .filter(employee -> employee.getStatus().equals(UserStatus.ACTIVE))
                .sorted(Comparator.comparingInt(Employee::getId))
                .map(Employee::getName)
                // terminal operation
                .toList();
        System.out.println(employeeNames);
        System.out.println(employeeWithStream);
    }
}
