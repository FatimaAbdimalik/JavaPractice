package com.lessonone; // specify which package does the class belongs to?

import java.util.Date;

// main class, starts with capital
public class Main {
    // public === access modifiers
// method, main
    // return type === void, not returning anything
    public static void main(String[] args) {
	// write your code here
        // system class in Java

        Employee employee = new Employee(500, 10, 8);
        employee.setBaseSalary(1000);
        employee.setHourlyRate(10);
        System.out.println(employee.calculateWage());
    }
}
