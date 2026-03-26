
package com.bai3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName()   { return name; }
    public double getSalary() { return salary; }
}

public class Bai3 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Anna",  1500.0), 
            new Employee(2, "Peter",  800.0), 
            new Employee(3, "Mary",  1200.0),  
            new Employee(4, "John",   500.0)   
        );

        List<String> result = employees.stream()
            .filter(e -> e.getSalary() > 1000)   
            .map(Employee::getName)               
            .sorted()                             
            .collect(Collectors.toList());        

        System.out.println("Nhân viên lương > 1000 (A-Z): " + result);
    }
}
