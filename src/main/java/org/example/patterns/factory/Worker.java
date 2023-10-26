package org.example.patterns.factory;

public class Worker  extends Employee{

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Worker; Avarage salary (fixed) %.2f rub.", surName, name, salary);
    }

}
