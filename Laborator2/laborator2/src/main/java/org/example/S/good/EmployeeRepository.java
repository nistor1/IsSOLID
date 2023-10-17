package org.example.S.good;

public class EmployeeRepository {
    public void save(GoodEmployee employee) {
        System.out.println(String.format("Saving %s to the database.", employee.getName()));
    }
}
