package org.example.module11;

public class Employee {
    private Integer id;
    private String name;
    private UserStatus status;

    public Employee(Integer id, String name, UserStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public  Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
